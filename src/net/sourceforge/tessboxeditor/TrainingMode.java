package net.sourceforge.tessboxeditor;

/**
 * Supported training modes.
 */
public enum TrainingMode {

    Header("-- Training Mode --"),
    /**
     *
     */
    Make_Box_File_Only("Make Box File Only"),
    /**
     *
     */
    Train_with_Existing_Box("Train with Existing Box"),
    /**
     *
     */
    Shape_Clustering("    Shape Clustering..."),
    /**
     *
     */
    Dictionary("    Dictionary..."),
    /**
     *
     */
    Train_from_Scratch("Train from Scratch");

    private final String display;

    private TrainingMode(String str) {
        this.display = str;
    }

    /**
     * Gets enum from description.
     *
     * @param desc
     * @return
     */
    public static TrainingMode getMode(String desc) {
        if (desc != null) {
            for (TrainingMode mode : TrainingMode.values()) {
                if (desc.equalsIgnoreCase(mode.display)) {
                    return mode;
                }
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return display.replace("_", " ");
    }
}