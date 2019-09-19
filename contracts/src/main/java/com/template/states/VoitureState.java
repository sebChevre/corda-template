package com.template.states;

import com.template.contracts.VoitureContract;
import com.template.contracts.TemplateContract;
import net.corda.core.contracts.BelongsToContract;
import net.corda.core.contracts.ContractState;
import net.corda.core.contracts.UniqueIdentifier;
import net.corda.core.identity.AbstractParty;
import net.corda.core.identity.Party;
import java.util.Arrays;
import java.util.List;

// *********
// * State *
// *********
@BelongsToContract(VoitureContract.class)
public class VoitureState implements ContractState {

    Party owningBank;
    Party holdingDealer;
    Party fabricant;
    String vin;
    String numeroPlaque;
    String make;
    String model;
    String dealershipLocation;
    UniqueIdentifier linearId;

    public VoitureState(Party owningBank, Party holdingDealer, Party fabricant, String vin, String numeroPlaque, String make, String model, String dealershipLocation, UniqueIdentifier linearId) {
        this.owningBank = owningBank;
        this.holdingDealer = holdingDealer;
        this.fabricant = fabricant;
        this.vin = vin;
        this.numeroPlaque = numeroPlaque;
        this.make = make;
        this.model = model;
        this.dealershipLocation = dealershipLocation;
        this.linearId = linearId;
    }

    public VoitureState() {

    }

    @Override
    public List<AbstractParty> getParticipants() {

        return Arrays.asList(owningBank,holdingDealer,fabricant);
    }

    public Party getOwningBank() {
        return owningBank;
    }

    public Party getHoldingDealer() {
        return holdingDealer;
    }

    public Party getFabricant() {
        return fabricant;
    }

    public String getVin() {
        return vin;
    }

    public String getNumeroPlaque() {
        return numeroPlaque;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getDealershipLocation() {
        return dealershipLocation;
    }

    public UniqueIdentifier getLinearId() {
        return linearId;
    }
}