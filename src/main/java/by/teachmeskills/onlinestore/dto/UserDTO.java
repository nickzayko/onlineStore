package by.teachmeskills.onlinestore.dto;



import java.util.Date;

public class UserDTO {
    private String loginUserDTO;
    private String passwordUserDTO;
    private String firstNameUserDTO;
    private String lastNameUserDTO;
    private String emailUserDTO;
    private String sexUserDTO;
    private int telephoneNumberUserDTO;
    private String dateOfBirthUserDTO;
    private String countryUserDTO;
    private String regionUserDTO;
    private String cityUserDTO;
    private String streetUserDTO;
    private String buildNumberUserDTO;

    public UserDTO() {
    }

    public UserDTO(String loginUserDTO, String passwordUserDTO, String firstNameUserDTO, String lastNameUserDTO,
                   String emailUserDTO, String sexUserDTO, int telephoneNumberUserDTO, String dateOfBirthUserDTO,
                   String countryUserDTO, String regionUserDTO, String cityUserDTO, String streetUserDTO,
                   String buildNumberUserDTO) {
        this.loginUserDTO = loginUserDTO;
        this.passwordUserDTO = passwordUserDTO;
        this.firstNameUserDTO = firstNameUserDTO;
        this.lastNameUserDTO = lastNameUserDTO;
        this.emailUserDTO = emailUserDTO;
        this.sexUserDTO = sexUserDTO;
        this.telephoneNumberUserDTO = telephoneNumberUserDTO;
        this.dateOfBirthUserDTO = dateOfBirthUserDTO;
        this.countryUserDTO = countryUserDTO;
        this.regionUserDTO = regionUserDTO;
        this.cityUserDTO = cityUserDTO;
        this.streetUserDTO = streetUserDTO;
        this.buildNumberUserDTO = buildNumberUserDTO;
    }

//    getters and setters

    public String getLoginUserDTO() {
        return loginUserDTO;
    }

    public void setLoginUserDTO(String loginUserDTO) {
        this.loginUserDTO = loginUserDTO;
    }

    public String getPasswordUserDTO() {
        return passwordUserDTO;
    }

    public void setPasswordUserDTO(String passwordUserDTO) {
        this.passwordUserDTO = passwordUserDTO;
    }

    public String getFirstNameUserDTO() {
        return firstNameUserDTO;
    }

    public void setFirstNameUserDTO(String firstNameUserDTO) {
        this.firstNameUserDTO = firstNameUserDTO;
    }

    public String getLastNameUserDTO() {
        return lastNameUserDTO;
    }

    public void setLastNameUserDTO(String lastNameUserDTO) {
        this.lastNameUserDTO = lastNameUserDTO;
    }

    public String getEmailUserDTO() {
        return emailUserDTO;
    }

    public void setEmailUserDTO(String emailUserDTO) {
        this.emailUserDTO = emailUserDTO;
    }

    public String getSexUserDTO() {
        return sexUserDTO;
    }

    public void setSexUserDTO(String sexUserDTO) {
        this.sexUserDTO = sexUserDTO;
    }

    public int getTelephoneNumberUserDTO() {
        return telephoneNumberUserDTO;
    }

    public void setTelephoneNumberUserDTO(int telephoneNumberUserDTO) {
        this.telephoneNumberUserDTO = telephoneNumberUserDTO;
    }

    public String getDateOfBirthUserDTO() {
        return dateOfBirthUserDTO;
    }

    public void setDateOfBirthUserDTO(String dateOfBirthUserDTO) {
        this.dateOfBirthUserDTO = dateOfBirthUserDTO;
    }

    public String getCountryUserDTO() {
        return countryUserDTO;
    }

    public void setCountryUserDTO(String countryUserDTO) {
        this.countryUserDTO = countryUserDTO;
    }

    public String getRegionUserDTO() {
        return regionUserDTO;
    }

    public void setRegionUserDTO(String regionUserDTO) {
        this.regionUserDTO = regionUserDTO;
    }

    public String getCityUserDTO() {
        return cityUserDTO;
    }

    public void setCityUserDTO(String cityUserDTO) {
        this.cityUserDTO = cityUserDTO;
    }

    public String getStreetUserDTO() {
        return streetUserDTO;
    }

    public void setStreetUserDTO(String streetUserDTO) {
        this.streetUserDTO = streetUserDTO;
    }

    public String getBuildNumberUserDTO() {
        return buildNumberUserDTO;
    }

    public void setBuildNumberUserDTO(String buildNumberUserDTO) {
        this.buildNumberUserDTO = buildNumberUserDTO;
    }
}
