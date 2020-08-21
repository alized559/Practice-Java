public class PhysicalAddress {
  private String Street;
  private String City;
  private String Kada;
  private AddressTypeEnum AddressType;

  public PhysicalAddress(String newStreet, String newCity, String newKada) {
    this.Street = newStreet;
    this.City = newCity;
    this.Kada = newKada;
    this.AddressType = AddressTypeEnum.Home;
  }

  public String getStreet() {
    return this.Street;
  }

  public void setStreet(String newStreet) {
    this.Street = newStreet;
  }

  public String getCity() {
    return this.City;
  }

  public void setCity(String newCity) {
    this.City = newCity;
  }

  public String getKada() {
    return this.Kada;
  }

  public void setKada(String newKada) {
    this.Kada = newKada;
  }

  public AddressTypeEnum getAddressType() {
    return this.AddressType;
  }

  public void setAddressType(AddressTypeEnum newAddressType) {
    this.AddressType = newAddressType;
  }
}
