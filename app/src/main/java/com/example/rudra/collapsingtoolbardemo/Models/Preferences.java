package com.example.rudra.collapsingtoolbardemo.Models;




import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Preferences {

    @SerializedName("preferred_major_species")
    @Expose
    private String preferredMajorSpecies;
    @SerializedName("preferred_species_db")
    @Expose
    private String preferredSpeciesDb;
    @SerializedName("preferred_water_body")
    @Expose
    private String preferredWaterBody;
    @SerializedName("preferred_fishing_technique")
    @Expose
    private String preferredFishingTechnique;
    @SerializedName("fish_weight_unit")
    @Expose
    private String fishWeightUnit;
    @SerializedName("image_note_scope")
    @Expose
    private String imageNoteScope;
    @SerializedName("preferred_unit")
    @Expose
    private String preferredUnit;

    public String getPreferredMajorSpecies() {
        return preferredMajorSpecies;
    }

    public void setPreferredMajorSpecies(String preferredMajorSpecies) {
        this.preferredMajorSpecies = preferredMajorSpecies;
    }

    public String getPreferredSpeciesDb() {
        return preferredSpeciesDb;
    }

    public void setPreferredSpeciesDb(String preferredSpeciesDb) {
        this.preferredSpeciesDb = preferredSpeciesDb;
    }

    public String getPreferredWaterBody() {
        return preferredWaterBody;
    }

    public void setPreferredWaterBody(String preferredWaterBody) {
        this.preferredWaterBody = preferredWaterBody;
    }

    public String getPreferredFishingTechnique() {
        return preferredFishingTechnique;
    }

    public void setPreferredFishingTechnique(String preferredFishingTechnique) {
        this.preferredFishingTechnique = preferredFishingTechnique;
    }

    public String getFishWeightUnit() {
        return fishWeightUnit;
    }

    public void setFishWeightUnit(String fishWeightUnit) {
        this.fishWeightUnit = fishWeightUnit;
    }

    public String getImageNoteScope() {
        return imageNoteScope;
    }

    public void setImageNoteScope(String imageNoteScope) {
        this.imageNoteScope = imageNoteScope;
    }

    public String getPreferredUnit() {
        return preferredUnit;
    }

    public void setPreferredUnit(String preferredUnit) {
        this.preferredUnit = preferredUnit;
    }

}
