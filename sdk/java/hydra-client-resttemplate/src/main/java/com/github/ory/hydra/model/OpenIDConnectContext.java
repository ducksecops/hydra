/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * OpenAPI spec version: latest
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.ory.hydra.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * OpenIDConnectContext
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-17T17:51:30.376+02:00")
public class OpenIDConnectContext {
  @JsonProperty("acr_values")
  private List<String> acrValues = null;

  @JsonProperty("display")
  private String display = null;

  @JsonProperty("id_token_hint_claims")
  private Map<String, Object> idTokenHintClaims = null;

  @JsonProperty("login_hint")
  private String loginHint = null;

  @JsonProperty("ui_locales")
  private List<String> uiLocales = null;

  public OpenIDConnectContext acrValues(List<String> acrValues) {
    this.acrValues = acrValues;
    return this;
  }

  public OpenIDConnectContext addAcrValuesItem(String acrValuesItem) {
    if (this.acrValues == null) {
      this.acrValues = new ArrayList<String>();
    }
    this.acrValues.add(acrValuesItem);
    return this;
  }

   /**
   * ACRValues is the Authentication AuthorizationContext Class Reference requested in the OAuth 2.0 Authorization request. It is a parameter defined by OpenID Connect and expresses which level of authentication (e.g. 2FA) is required.  OpenID Connect defines it as follows: &gt; Requested Authentication AuthorizationContext Class Reference values. Space-separated string that specifies the acr values that the Authorization Server is being requested to use for processing this Authentication Request, with the values appearing in order of preference. The Authentication AuthorizationContext Class satisfied by the authentication performed is returned as the acr Claim Value, as specified in Section 2. The acr Claim is requested as a Voluntary Claim by this parameter.
   * @return acrValues
  **/
  @ApiModelProperty(value = "ACRValues is the Authentication AuthorizationContext Class Reference requested in the OAuth 2.0 Authorization request. It is a parameter defined by OpenID Connect and expresses which level of authentication (e.g. 2FA) is required.  OpenID Connect defines it as follows: > Requested Authentication AuthorizationContext Class Reference values. Space-separated string that specifies the acr values that the Authorization Server is being requested to use for processing this Authentication Request, with the values appearing in order of preference. The Authentication AuthorizationContext Class satisfied by the authentication performed is returned as the acr Claim Value, as specified in Section 2. The acr Claim is requested as a Voluntary Claim by this parameter.")
  public List<String> getAcrValues() {
    return acrValues;
  }

  public void setAcrValues(List<String> acrValues) {
    this.acrValues = acrValues;
  }

  public OpenIDConnectContext display(String display) {
    this.display = display;
    return this;
  }

   /**
   * Display is a string value that specifies how the Authorization Server displays the authentication and consent user interface pages to the End-User. The defined values are: page: The Authorization Server SHOULD display the authentication and consent UI consistent with a full User Agent page view. If the display parameter is not specified, this is the default display mode. popup: The Authorization Server SHOULD display the authentication and consent UI consistent with a popup User Agent window. The popup User Agent window should be of an appropriate size for a login-focused dialog and should not obscure the entire window that it is popping up over. touch: The Authorization Server SHOULD display the authentication and consent UI consistent with a device that leverages a touch interface. wap: The Authorization Server SHOULD display the authentication and consent UI consistent with a \&quot;feature phone\&quot; type display.  The Authorization Server MAY also attempt to detect the capabilities of the User Agent and present an appropriate display.
   * @return display
  **/
  @ApiModelProperty(value = "Display is a string value that specifies how the Authorization Server displays the authentication and consent user interface pages to the End-User. The defined values are: page: The Authorization Server SHOULD display the authentication and consent UI consistent with a full User Agent page view. If the display parameter is not specified, this is the default display mode. popup: The Authorization Server SHOULD display the authentication and consent UI consistent with a popup User Agent window. The popup User Agent window should be of an appropriate size for a login-focused dialog and should not obscure the entire window that it is popping up over. touch: The Authorization Server SHOULD display the authentication and consent UI consistent with a device that leverages a touch interface. wap: The Authorization Server SHOULD display the authentication and consent UI consistent with a \"feature phone\" type display.  The Authorization Server MAY also attempt to detect the capabilities of the User Agent and present an appropriate display.")
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public OpenIDConnectContext idTokenHintClaims(Map<String, Object> idTokenHintClaims) {
    this.idTokenHintClaims = idTokenHintClaims;
    return this;
  }

  public OpenIDConnectContext putIdTokenHintClaimsItem(String key, Object idTokenHintClaimsItem) {
    if (this.idTokenHintClaims == null) {
      this.idTokenHintClaims = new HashMap<String, Object>();
    }
    this.idTokenHintClaims.put(key, idTokenHintClaimsItem);
    return this;
  }

   /**
   * IDTokenHintClaims are the claims of the ID Token previously issued by the Authorization Server being passed as a hint about the End-User&#39;s current or past authenticated session with the Client.
   * @return idTokenHintClaims
  **/
  @ApiModelProperty(value = "IDTokenHintClaims are the claims of the ID Token previously issued by the Authorization Server being passed as a hint about the End-User's current or past authenticated session with the Client.")
  public Map<String, Object> getIdTokenHintClaims() {
    return idTokenHintClaims;
  }

  public void setIdTokenHintClaims(Map<String, Object> idTokenHintClaims) {
    this.idTokenHintClaims = idTokenHintClaims;
  }

  public OpenIDConnectContext loginHint(String loginHint) {
    this.loginHint = loginHint;
    return this;
  }

   /**
   * LoginHint hints about the login identifier the End-User might use to log in (if necessary). This hint can be used by an RP if it first asks the End-User for their e-mail address (or other identifier) and then wants to pass that value as a hint to the discovered authorization service. This value MAY also be a phone number in the format specified for the phone_number Claim. The use of this parameter is optional.
   * @return loginHint
  **/
  @ApiModelProperty(value = "LoginHint hints about the login identifier the End-User might use to log in (if necessary). This hint can be used by an RP if it first asks the End-User for their e-mail address (or other identifier) and then wants to pass that value as a hint to the discovered authorization service. This value MAY also be a phone number in the format specified for the phone_number Claim. The use of this parameter is optional.")
  public String getLoginHint() {
    return loginHint;
  }

  public void setLoginHint(String loginHint) {
    this.loginHint = loginHint;
  }

  public OpenIDConnectContext uiLocales(List<String> uiLocales) {
    this.uiLocales = uiLocales;
    return this;
  }

  public OpenIDConnectContext addUiLocalesItem(String uiLocalesItem) {
    if (this.uiLocales == null) {
      this.uiLocales = new ArrayList<String>();
    }
    this.uiLocales.add(uiLocalesItem);
    return this;
  }

   /**
   * UILocales is the End-User&#39;id preferred languages and scripts for the user interface, represented as a space-separated list of BCP47 [RFC5646] language tag values, ordered by preference. For instance, the value \&quot;fr-CA fr en\&quot; represents a preference for French as spoken in Canada, then French (without a region designation), followed by English (without a region designation). An error SHOULD NOT result if some or all of the requested locales are not supported by the OpenID Provider.
   * @return uiLocales
  **/
  @ApiModelProperty(value = "UILocales is the End-User'id preferred languages and scripts for the user interface, represented as a space-separated list of BCP47 [RFC5646] language tag values, ordered by preference. For instance, the value \"fr-CA fr en\" represents a preference for French as spoken in Canada, then French (without a region designation), followed by English (without a region designation). An error SHOULD NOT result if some or all of the requested locales are not supported by the OpenID Provider.")
  public List<String> getUiLocales() {
    return uiLocales;
  }

  public void setUiLocales(List<String> uiLocales) {
    this.uiLocales = uiLocales;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenIDConnectContext openIDConnectContext = (OpenIDConnectContext) o;
    return Objects.equals(this.acrValues, openIDConnectContext.acrValues) &&
        Objects.equals(this.display, openIDConnectContext.display) &&
        Objects.equals(this.idTokenHintClaims, openIDConnectContext.idTokenHintClaims) &&
        Objects.equals(this.loginHint, openIDConnectContext.loginHint) &&
        Objects.equals(this.uiLocales, openIDConnectContext.uiLocales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acrValues, display, idTokenHintClaims, loginHint, uiLocales);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenIDConnectContext {\n");
    
    sb.append("    acrValues: ").append(toIndentedString(acrValues)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    idTokenHintClaims: ").append(toIndentedString(idTokenHintClaims)).append("\n");
    sb.append("    loginHint: ").append(toIndentedString(loginHint)).append("\n");
    sb.append("    uiLocales: ").append(toIndentedString(uiLocales)).append("\n");
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

