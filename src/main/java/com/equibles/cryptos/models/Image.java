/*
 * Cryptos
 * <h3>Authentication</h3>                     You need to authenticate to use this API.                     To authenticate click on the \"Authorize\" button and do one of the following steps.<br />                     1. Send your API key in the headers of the request by typing \"Bearer my-key\" on the Bearer authorization scheme.<br />                     2. Send your API key on the \"ApiKey\" query string parameter. To do this type your API key in the Query String authorization scheme.<br />                     Both methods are equally valid. We offer both options so that you can use the method that is easier to use in your application.<br />                     <br />                     <h3>API limits</h3>                     Your API key may be subject to daily/hourly limits. To know how much requests you have left look at the following headers in the response.<br />                     1. <strong>x-ratelimit-limit</strong> - The total number of requests that you are allowed to make in a given period (hour/day)                       2. <strong>x-ratelimit-remaining</strong> - The number of remaining requests that you can perform in the current period.<br />                     3. <strong>x-ratelimit-reset</strong> - The number of seconds until the current period resets.<br />                     <br />                     <h3>Suggestions</h3>                     You don't need to implement the whole API by hand in your programming language of choice.<br />                     Since this API has an OpenAPI specification you can use                      <a href=\"https://github.com/swagger-api/swagger-codegen\" target=\"_blank\">Swagger Generator</a>                      to automatically generate client stubs for more than 30 programming languages.                     <br />                     <br />                     You don't have an API key? <a href=\"https://www.equibles.com/api/pricing\" target=\"_blank\">Get one for free here.</a>
 *
 * OpenAPI spec version: v1
 * Contact: equibles@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.equibles.cryptos.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Image
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-02T22:25:24.150Z[Europe/Lisbon]")
public class Image {
  @SerializedName("size")
  private Long size = null;

  @SerializedName("extension")
  private String extension = null;

  @SerializedName("filename")
  private String filename = null;

  @SerializedName("contentType")
  private String contentType = null;

  @SerializedName("webPath")
  private String webPath = null;

  @SerializedName("webPathname")
  private String webPathname = null;

  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  public Image size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the image in bytes.
   * @return size
  **/
  @Schema(description = "The size of the image in bytes.")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public Image extension(String extension) {
    this.extension = extension;
    return this;
  }

   /**
   * The image extension. I.e. png.
   * @return extension
  **/
  @Schema(description = "The image extension. I.e. png.")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public Image filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * The image name.
   * @return filename
  **/
  @Schema(description = "The image name.")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public Image contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * The content type. I.e. image/png.
   * @return contentType
  **/
  @Schema(description = "The content type. I.e. image/png.")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public Image webPath(String webPath) {
    this.webPath = webPath;
    return this;
  }

   /**
   * The url of the folder where the image is stored.
   * @return webPath
  **/
  @Schema(description = "The url of the folder where the image is stored.")
  public String getWebPath() {
    return webPath;
  }

  public void setWebPath(String webPath) {
    this.webPath = webPath;
  }

  public Image webPathname(String webPathname) {
    this.webPathname = webPathname;
    return this;
  }

   /**
   * The url where the image stored. You can use this URL to download the image.
   * @return webPathname
  **/
  @Schema(description = "The url where the image stored. You can use this URL to download the image.")
  public String getWebPathname() {
    return webPathname;
  }

  public void setWebPathname(String webPathname) {
    this.webPathname = webPathname;
  }

  public Image width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * The width in pixels of the image.
   * @return width
  **/
  @Schema(description = "The width in pixels of the image.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public Image height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * The height in pixels of the image.
   * @return height
  **/
  @Schema(description = "The height in pixels of the image.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image image = (Image) o;
    return Objects.equals(this.size, image.size) &&
        Objects.equals(this.extension, image.extension) &&
        Objects.equals(this.filename, image.filename) &&
        Objects.equals(this.contentType, image.contentType) &&
        Objects.equals(this.webPath, image.webPath) &&
        Objects.equals(this.webPathname, image.webPathname) &&
        Objects.equals(this.width, image.width) &&
        Objects.equals(this.height, image.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, extension, filename, contentType, webPath, webPathname, width, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    webPath: ").append(toIndentedString(webPath)).append("\n");
    sb.append("    webPathname: ").append(toIndentedString(webPathname)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
