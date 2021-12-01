package gr.codelearn.domain.enumeration;

public enum Color {
    WHITE("LEUKO"), BLACK("MAURO"), RGB("KPM");

    String greekName;

    Color(String greekName) {
        this.greekName = greekName;
    }

    public String getGreekName() {
        return greekName;
    }
}
