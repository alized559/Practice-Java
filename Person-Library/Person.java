abstract class Person {
  private String Name;
  private String PhoneNumber;
  private String EmailAddress;
  private PhysicalAddress Address;

  public Person(String newName) {
    this.Name = newName;
  }

  public String getName() {
    return this.Name;
  }

  public void setStreet(String newName) {
    this.Name = newName;
  }

  public String getPhoneNumber() {
    return this.PhoneNumber;
  }

  public void setPhoneNumber(String newPhoneNumber) {
    if (newPhoneNumber.length() != 8 && newPhoneNumber.charAt(0) != 0
          && newPhoneNumber.charAt(0) != 7)
      throw new IllegalArgumentException("Phone number is not valid");

    if (newPhoneNumber.charAt(0) == 0 && newPhoneNumber.charAt(1) == 0) {
      throw new IllegalArgumentException("Phone number is not valid");
    }

    if (newPhoneNumber.charAt(0) == 7 && newPhoneNumber.charAt(1) != 0
         && newPhoneNumber.charAt(1) != 1 && newPhoneNumber.charAt(1) != 6) {
      throw new IllegalArgumentException("Phone number is not valid");
    }

    this.PhoneNumber = newPhoneNumber;
  }

  public String getEmailAddress() {
    return this.EmailAddress;
  }

  public void setEmailAddress(String newEmailAddress) {
    int idx = newEmailAddress.indexOf("@");
    if (idx == -1) {
      throw new IllegalArgumentException("email address is not valid");
    }
    String str = newEmailAddress.substring(idx);
    if (!str.equals("@aub.edu.lb"))
      throw new IllegalArgumentException("email address is not valid");
    this.EmailAddress = newEmailAddress;
  }

  public PhysicalAddress getAddress() {
    return this.Address;
  }

  public void setAddress(PhysicalAddress newAddress) {
    this.Address = newAddress;
  }

  abstract void Work();
}
