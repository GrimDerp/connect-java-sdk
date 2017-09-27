/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.squareup.connect.models.Address;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents one of a business&#39;s locations.
 */
@ApiModel(description = "Represents one of a business's locations.")

public class Location {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("address")
  private Address address = null;

  @JsonProperty("timezone")
  private String timezone = null;

  /**
   * Gets or Sets capabilities
   */
  public enum CapabilitiesEnum {
    PROCESSING("CREDIT_CARD_PROCESSING");

    private String value;

    CapabilitiesEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CapabilitiesEnum fromValue(String text) {
      for (CapabilitiesEnum b : CapabilitiesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("capabilities")
  private List<CapabilitiesEnum> capabilities = new ArrayList<CapabilitiesEnum>();

  /**
   * The location's status  See [LocationStatus](#type-locationstatus) for possible values.
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("merchant_id")
  private String merchantId = null;

  /**
   * The location's country, in ISO 3166-1-alpha-2 format.  See [Country](#type-country) for possible values.
   */
  public enum CountryEnum {
    ZZ("ZZ"),
    
    AD("AD"),
    
    AE("AE"),
    
    AF("AF"),
    
    AG("AG"),
    
    AI("AI"),
    
    AL("AL"),
    
    AM("AM"),
    
    AO("AO"),
    
    AQ("AQ"),
    
    AR("AR"),
    
    AS("AS"),
    
    AT("AT"),
    
    AU("AU"),
    
    AW("AW"),
    
    AX("AX"),
    
    AZ("AZ"),
    
    BA("BA"),
    
    BB("BB"),
    
    BD("BD"),
    
    BE("BE"),
    
    BF("BF"),
    
    BG("BG"),
    
    BH("BH"),
    
    BI("BI"),
    
    BJ("BJ"),
    
    BL("BL"),
    
    BM("BM"),
    
    BN("BN"),
    
    BO("BO"),
    
    BQ("BQ"),
    
    BR("BR"),
    
    BS("BS"),
    
    BT("BT"),
    
    BV("BV"),
    
    BW("BW"),
    
    BY("BY"),
    
    BZ("BZ"),
    
    CA("CA"),
    
    CC("CC"),
    
    CD("CD"),
    
    CF("CF"),
    
    CG("CG"),
    
    CH("CH"),
    
    CI("CI"),
    
    CK("CK"),
    
    CL("CL"),
    
    CM("CM"),
    
    CN("CN"),
    
    CO("CO"),
    
    CR("CR"),
    
    CU("CU"),
    
    CV("CV"),
    
    CW("CW"),
    
    CX("CX"),
    
    CY("CY"),
    
    CZ("CZ"),
    
    DE("DE"),
    
    DJ("DJ"),
    
    DK("DK"),
    
    DM("DM"),
    
    DO("DO"),
    
    DZ("DZ"),
    
    EC("EC"),
    
    EE("EE"),
    
    EG("EG"),
    
    EH("EH"),
    
    ER("ER"),
    
    ES("ES"),
    
    ET("ET"),
    
    FI("FI"),
    
    FJ("FJ"),
    
    FK("FK"),
    
    FM("FM"),
    
    FO("FO"),
    
    FR("FR"),
    
    GA("GA"),
    
    GB("GB"),
    
    GD("GD"),
    
    GE("GE"),
    
    GF("GF"),
    
    GG("GG"),
    
    GH("GH"),
    
    GI("GI"),
    
    GL("GL"),
    
    GM("GM"),
    
    GN("GN"),
    
    GP("GP"),
    
    GQ("GQ"),
    
    GR("GR"),
    
    GS("GS"),
    
    GT("GT"),
    
    GU("GU"),
    
    GW("GW"),
    
    GY("GY"),
    
    HK("HK"),
    
    HM("HM"),
    
    HN("HN"),
    
    HR("HR"),
    
    HT("HT"),
    
    HU("HU"),
    
    ID("ID"),
    
    IE("IE"),
    
    IL("IL"),
    
    IM("IM"),
    
    IN("IN"),
    
    IO("IO"),
    
    IQ("IQ"),
    
    IR("IR"),
    
    IS("IS"),
    
    IT("IT"),
    
    JE("JE"),
    
    JM("JM"),
    
    JO("JO"),
    
    JP("JP"),
    
    KE("KE"),
    
    KG("KG"),
    
    KH("KH"),
    
    KI("KI"),
    
    KM("KM"),
    
    KN("KN"),
    
    KP("KP"),
    
    KR("KR"),
    
    KW("KW"),
    
    KY("KY"),
    
    KZ("KZ"),
    
    LA("LA"),
    
    LB("LB"),
    
    LC("LC"),
    
    LI("LI"),
    
    LK("LK"),
    
    LR("LR"),
    
    LS("LS"),
    
    LT("LT"),
    
    LU("LU"),
    
    LV("LV"),
    
    LY("LY"),
    
    MA("MA"),
    
    MC("MC"),
    
    MD("MD"),
    
    ME("ME"),
    
    MF("MF"),
    
    MG("MG"),
    
    MH("MH"),
    
    MK("MK"),
    
    ML("ML"),
    
    MM("MM"),
    
    MN("MN"),
    
    MO("MO"),
    
    MP("MP"),
    
    MQ("MQ"),
    
    MR("MR"),
    
    MS("MS"),
    
    MT("MT"),
    
    MU("MU"),
    
    MV("MV"),
    
    MW("MW"),
    
    MX("MX"),
    
    MY("MY"),
    
    MZ("MZ"),
    
    NA("NA"),
    
    NC("NC"),
    
    NE("NE"),
    
    NF("NF"),
    
    NG("NG"),
    
    NI("NI"),
    
    NL("NL"),
    
    NO("NO"),
    
    NP("NP"),
    
    NR("NR"),
    
    NU("NU"),
    
    NZ("NZ"),
    
    OM("OM"),
    
    PA("PA"),
    
    PE("PE"),
    
    PF("PF"),
    
    PG("PG"),
    
    PH("PH"),
    
    PK("PK"),
    
    PL("PL"),
    
    PM("PM"),
    
    PN("PN"),
    
    PR("PR"),
    
    PS("PS"),
    
    PT("PT"),
    
    PW("PW"),
    
    PY("PY"),
    
    QA("QA"),
    
    RE("RE"),
    
    RO("RO"),
    
    RS("RS"),
    
    RU("RU"),
    
    RW("RW"),
    
    SA("SA"),
    
    SB("SB"),
    
    SC("SC"),
    
    SD("SD"),
    
    SE("SE"),
    
    SG("SG"),
    
    SH("SH"),
    
    SI("SI"),
    
    SJ("SJ"),
    
    SK("SK"),
    
    SL("SL"),
    
    SM("SM"),
    
    SN("SN"),
    
    SO("SO"),
    
    SR("SR"),
    
    SS("SS"),
    
    ST("ST"),
    
    SV("SV"),
    
    SX("SX"),
    
    SY("SY"),
    
    SZ("SZ"),
    
    TC("TC"),
    
    TD("TD"),
    
    TF("TF"),
    
    TG("TG"),
    
    TH("TH"),
    
    TJ("TJ"),
    
    TK("TK"),
    
    TL("TL"),
    
    TM("TM"),
    
    TN("TN"),
    
    TO("TO"),
    
    TR("TR"),
    
    TT("TT"),
    
    TV("TV"),
    
    TW("TW"),
    
    TZ("TZ"),
    
    UA("UA"),
    
    UG("UG"),
    
    UM("UM"),
    
    US("US"),
    
    UY("UY"),
    
    UZ("UZ"),
    
    VA("VA"),
    
    VC("VC"),
    
    VE("VE"),
    
    VG("VG"),
    
    VI("VI"),
    
    VN("VN"),
    
    VU("VU"),
    
    WF("WF"),
    
    WS("WS"),
    
    YE("YE"),
    
    YT("YT"),
    
    ZA("ZA"),
    
    ZM("ZM"),
    
    ZW("ZW");

    private String value;

    CountryEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CountryEnum fromValue(String text) {
      for (CountryEnum b : CountryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("country")
  private CountryEnum country = null;

  @JsonProperty("language_code")
  private String languageCode = null;

  /**
   * The currency used for all transactions at this location, specified in __ISO 4217 format__. For example, the currency for a location processing transactions in the United States is 'USD'.  See [Currency](#type-currency) for possible values.
   */
  public enum CurrencyEnum {
    UNKNOWN_CURRENCY("UNKNOWN_CURRENCY"),
    
    AED("AED"),
    
    AFN("AFN"),
    
    ALL("ALL"),
    
    AMD("AMD"),
    
    ANG("ANG"),
    
    AOA("AOA"),
    
    ARS("ARS"),
    
    AUD("AUD"),
    
    AWG("AWG"),
    
    AZN("AZN"),
    
    BAM("BAM"),
    
    BBD("BBD"),
    
    BDT("BDT"),
    
    BGN("BGN"),
    
    BHD("BHD"),
    
    BIF("BIF"),
    
    BMD("BMD"),
    
    BND("BND"),
    
    BOB("BOB"),
    
    BOV("BOV"),
    
    BRL("BRL"),
    
    BSD("BSD"),
    
    BTN("BTN"),
    
    BWP("BWP"),
    
    BYR("BYR"),
    
    BZD("BZD"),
    
    CAD("CAD"),
    
    CDF("CDF"),
    
    CHE("CHE"),
    
    CHF("CHF"),
    
    CHW("CHW"),
    
    CLF("CLF"),
    
    CLP("CLP"),
    
    CNY("CNY"),
    
    COP("COP"),
    
    COU("COU"),
    
    CRC("CRC"),
    
    CUC("CUC"),
    
    CUP("CUP"),
    
    CVE("CVE"),
    
    CZK("CZK"),
    
    DJF("DJF"),
    
    DKK("DKK"),
    
    DOP("DOP"),
    
    DZD("DZD"),
    
    EGP("EGP"),
    
    ERN("ERN"),
    
    ETB("ETB"),
    
    EUR("EUR"),
    
    FJD("FJD"),
    
    FKP("FKP"),
    
    GBP("GBP"),
    
    GEL("GEL"),
    
    GHS("GHS"),
    
    GIP("GIP"),
    
    GMD("GMD"),
    
    GNF("GNF"),
    
    GTQ("GTQ"),
    
    GYD("GYD"),
    
    HKD("HKD"),
    
    HNL("HNL"),
    
    HRK("HRK"),
    
    HTG("HTG"),
    
    HUF("HUF"),
    
    IDR("IDR"),
    
    ILS("ILS"),
    
    INR("INR"),
    
    IQD("IQD"),
    
    IRR("IRR"),
    
    ISK("ISK"),
    
    JMD("JMD"),
    
    JOD("JOD"),
    
    JPY("JPY"),
    
    KES("KES"),
    
    KGS("KGS"),
    
    KHR("KHR"),
    
    KMF("KMF"),
    
    KPW("KPW"),
    
    KRW("KRW"),
    
    KWD("KWD"),
    
    KYD("KYD"),
    
    KZT("KZT"),
    
    LAK("LAK"),
    
    LBP("LBP"),
    
    LKR("LKR"),
    
    LRD("LRD"),
    
    LSL("LSL"),
    
    LTL("LTL"),
    
    LVL("LVL"),
    
    LYD("LYD"),
    
    MAD("MAD"),
    
    MDL("MDL"),
    
    MGA("MGA"),
    
    MKD("MKD"),
    
    MMK("MMK"),
    
    MNT("MNT"),
    
    MOP("MOP"),
    
    MRO("MRO"),
    
    MUR("MUR"),
    
    MVR("MVR"),
    
    MWK("MWK"),
    
    MXN("MXN"),
    
    MXV("MXV"),
    
    MYR("MYR"),
    
    MZN("MZN"),
    
    NAD("NAD"),
    
    NGN("NGN"),
    
    NIO("NIO"),
    
    NOK("NOK"),
    
    NPR("NPR"),
    
    NZD("NZD"),
    
    OMR("OMR"),
    
    PAB("PAB"),
    
    PEN("PEN"),
    
    PGK("PGK"),
    
    PHP("PHP"),
    
    PKR("PKR"),
    
    PLN("PLN"),
    
    PYG("PYG"),
    
    QAR("QAR"),
    
    RON("RON"),
    
    RSD("RSD"),
    
    RUB("RUB"),
    
    RWF("RWF"),
    
    SAR("SAR"),
    
    SBD("SBD"),
    
    SCR("SCR"),
    
    SDG("SDG"),
    
    SEK("SEK"),
    
    SGD("SGD"),
    
    SHP("SHP"),
    
    SLL("SLL"),
    
    SOS("SOS"),
    
    SRD("SRD"),
    
    SSP("SSP"),
    
    STD("STD"),
    
    SVC("SVC"),
    
    SYP("SYP"),
    
    SZL("SZL"),
    
    THB("THB"),
    
    TJS("TJS"),
    
    TMT("TMT"),
    
    TND("TND"),
    
    TOP("TOP"),
    
    TRY("TRY"),
    
    TTD("TTD"),
    
    TWD("TWD"),
    
    TZS("TZS"),
    
    UAH("UAH"),
    
    UGX("UGX"),
    
    USD("USD"),
    
    USN("USN"),
    
    USS("USS"),
    
    UYI("UYI"),
    
    UYU("UYU"),
    
    UZS("UZS"),
    
    VEF("VEF"),
    
    VND("VND"),
    
    VUV("VUV"),
    
    WST("WST"),
    
    XAF("XAF"),
    
    XAG("XAG"),
    
    XAU("XAU"),
    
    XBA("XBA"),
    
    XBB("XBB"),
    
    XBC("XBC"),
    
    XBD("XBD"),
    
    XCD("XCD"),
    
    XDR("XDR"),
    
    XOF("XOF"),
    
    XPD("XPD"),
    
    XPF("XPF"),
    
    XPT("XPT"),
    
    XTS("XTS"),
    
    XXX("XXX"),
    
    YER("YER"),
    
    ZAR("ZAR"),
    
    ZMK("ZMK"),
    
    ZMW("ZMW"),
    
    BTC("BTC");

    private String value;

    CurrencyEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CurrencyEnum fromValue(String text) {
      for (CurrencyEnum b : CurrencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("currency")
  private CurrencyEnum currency = null;

  @JsonProperty("phone_number")
  private String phoneNumber = null;

  @JsonProperty("business_name")
  private String businessName = null;

  /**
   * The location's type, as set by the account owner in the Square dashboard. Typically used to indicate whether or not the location object represents a physical space like a building or mall space.  See [LocationType](#type-locationtype) for possible values.
   */
  public enum TypeEnum {
    PHYSICAL("PHYSICAL"),
    
    MOBILE("MOBILE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  public Location id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The location's unique ID.
   * @return id
  **/
  @ApiModelProperty(value = "The location's unique ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Location name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The location's name. Location names are set by the account owner and displayed in the dashboard as the location's nickname
   * @return name
  **/
  @ApiModelProperty(value = "The location's name. Location names are set by the account owner and displayed in the dashboard as the location's nickname")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Location address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * The location's physical address.
   * @return address
  **/
  @ApiModelProperty(value = "The location's physical address.")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Location timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * The [IANA Timezone Database](https://www.iana.org/time-zones) identifier for the location's timezone.
   * @return timezone
  **/
  @ApiModelProperty(value = "The [IANA Timezone Database](https://www.iana.org/time-zones) identifier for the location's timezone.")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public Location capabilities(List<CapabilitiesEnum> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public Location addCapabilitiesItem(CapabilitiesEnum capabilitiesItem) {
    this.capabilities.add(capabilitiesItem);
    return this;
  }

   /**
   * Indicates which Square features are enabled for the location.  See [LocationCapability](#type-locationcapability) for possible values.
   * @return capabilities
  **/
  @ApiModelProperty(value = "Indicates which Square features are enabled for the location.  See [LocationCapability](#type-locationcapability) for possible values.")
  public List<CapabilitiesEnum> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(List<CapabilitiesEnum> capabilities) {
    this.capabilities = capabilities;
  }

  public Location status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The location's status  See [LocationStatus](#type-locationstatus) for possible values.
   * @return status
  **/
  @ApiModelProperty(value = "The location's status  See [LocationStatus](#type-locationstatus) for possible values.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Location createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time when the location was created, in RFC 3339 format.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The time when the location was created, in RFC 3339 format.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Location merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * The identifier of the merchant that owns the location.
   * @return merchantId
  **/
  @ApiModelProperty(value = "The identifier of the merchant that owns the location.")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public Location country(CountryEnum country) {
    this.country = country;
    return this;
  }

   /**
   * The location's country, in ISO 3166-1-alpha-2 format.  See [Country](#type-country) for possible values.
   * @return country
  **/
  @ApiModelProperty(value = "The location's country, in ISO 3166-1-alpha-2 format.  See [Country](#type-country) for possible values.")
  public CountryEnum getCountry() {
    return country;
  }

  public void setCountry(CountryEnum country) {
    this.country = country;
  }

  public Location languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

   /**
   * The language associated with the location in [BCP 47 format](https://tools.ietf.org/html/bcp47#appendix-A).
   * @return languageCode
  **/
  @ApiModelProperty(value = "The language associated with the location in [BCP 47 format](https://tools.ietf.org/html/bcp47#appendix-A).")
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public Location currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The currency used for all transactions at this location, specified in __ISO 4217 format__. For example, the currency for a location processing transactions in the United States is 'USD'.  See [Currency](#type-currency) for possible values.
   * @return currency
  **/
  @ApiModelProperty(value = "The currency used for all transactions at this location, specified in __ISO 4217 format__. For example, the currency for a location processing transactions in the United States is 'USD'.  See [Currency](#type-currency) for possible values.")
  public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }

  public Location phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The location's phone_number.
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "The location's phone_number.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Location businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * The location's business_name which is shown to its customers. For example, this is the name printed on its customer's receipts.
   * @return businessName
  **/
  @ApiModelProperty(value = "The location's business_name which is shown to its customers. For example, this is the name printed on its customer's receipts.")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public Location type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The location's type, as set by the account owner in the Square dashboard. Typically used to indicate whether or not the location object represents a physical space like a building or mall space.  See [LocationType](#type-locationtype) for possible values.
   * @return type
  **/
  @ApiModelProperty(value = "The location's type, as set by the account owner in the Square dashboard. Typically used to indicate whether or not the location object represents a physical space like a building or mall space.  See [LocationType](#type-locationtype) for possible values.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.id, location.id) &&
        Objects.equals(this.name, location.name) &&
        Objects.equals(this.address, location.address) &&
        Objects.equals(this.timezone, location.timezone) &&
        Objects.equals(this.capabilities, location.capabilities) &&
        Objects.equals(this.status, location.status) &&
        Objects.equals(this.createdAt, location.createdAt) &&
        Objects.equals(this.merchantId, location.merchantId) &&
        Objects.equals(this.country, location.country) &&
        Objects.equals(this.languageCode, location.languageCode) &&
        Objects.equals(this.currency, location.currency) &&
        Objects.equals(this.phoneNumber, location.phoneNumber) &&
        Objects.equals(this.businessName, location.businessName) &&
        Objects.equals(this.type, location.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, timezone, capabilities, status, createdAt, merchantId, country, languageCode, currency, phoneNumber, businessName, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

