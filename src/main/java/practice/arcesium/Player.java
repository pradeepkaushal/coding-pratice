package practice.arcesium;


import java.util.Comparator;
import java.util.Objects;

public class Player {

    private String name;
    private FitnessFactor fitnessFactor;
    private StrikerExperienceFactor strikerExperienceFactor;
    private DefenderExperienceFactor defenderExperienceFactor;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FitnessFactor getFitnessFactor() {
        return fitnessFactor;
    }

    public void setFitnessFactor(FitnessFactor fitnessFactor) {
        this.fitnessFactor = fitnessFactor;
    }

    public StrikerExperienceFactor getStrikerExperienceFactor() {
        return strikerExperienceFactor;
    }

    public void setStrikerExperienceFactor(StrikerExperienceFactor strikerExperienceFactor) {
        this.strikerExperienceFactor = strikerExperienceFactor;
    }

    public DefenderExperienceFactor getDefenderExperienceFactor() {
        return defenderExperienceFactor;
    }

    public void setDefenderExperienceFactor(DefenderExperienceFactor defenderExperienceFactor) {
        this.defenderExperienceFactor = defenderExperienceFactor;
    }


    public static class DefenderComparator implements Comparator<Player> {
        //Used for sorting on the base
        public int compare(Player a, Player b) {
            DefenderExperienceFactor defenderExperienceFactorA = a.getDefenderExperienceFactor();
            DefenderExperienceFactor defenderExperienceFactorB = b.getDefenderExperienceFactor();
            return defenderExperienceFactorA.getMinGoalsDefended() - defenderExperienceFactorB.getMinGoalsDefended();
        }
    }


    public static class StrikerComparator implements Comparator<Player> {
        //Used for sorting on the base
        public int compare(Player a, Player b) {
            StrikerExperienceFactor strikerExperienceFactorA = a.getStrikerExperienceFactor();
            StrikerExperienceFactor strikerExperienceFactorB = b.getStrikerExperienceFactor();
            return strikerExperienceFactorA.getMinGoalsScored() - strikerExperienceFactorB.getMinGoalsScored();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name) &&
                Objects.equals(fitnessFactor, player.fitnessFactor) &&
                Objects.equals(strikerExperienceFactor, player.strikerExperienceFactor) &&
                Objects.equals(defenderExperienceFactor, player.defenderExperienceFactor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
