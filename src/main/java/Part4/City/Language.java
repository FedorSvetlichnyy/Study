package Part4.City;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "countryCode", "language", "isOfficial" })
public class Language {
    public String countryCode;
    public String language;
    public boolean isOfficial;

    public Language(String countryCode, String language, boolean isOfficial) {
        this.countryCode = countryCode;
        this.language = language;
        this.isOfficial = isOfficial;
    }

    @Override
    public String toString() {
        return "Language{" +
                "countryCode='" + countryCode + '\'' +
                ", language='" + language + '\'' +
                ", isOfficial=" + isOfficial +
                '}';
    }

    public String getCountryCode() {
        return countryCode;
    }

    public boolean isOfficial() {
        return isOfficial;
    }

    public String getLanguage() {
        return language;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setOfficial(boolean official) {
        isOfficial = official;
    }
}