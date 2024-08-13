/*
 * API de Produtos
 * API para gerenciar produtos em um inventário.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package example.micronaut.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import com.fasterxml.jackson.annotation.*;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import io.micronaut.core.annotation.Nullable;
import jakarta.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Product
 */
@Serdeable
@JsonPropertyOrder({
    Product.JSON_PROPERTY_ID,
    Product.JSON_PROPERTY_NAME,
    Product.JSON_PROPERTY_DESCRIPTION,
    Product.JSON_PROPERTY_PRICE
})
@Generated("io.micronaut.openapi.generator.JavaMicronautServerCodegen")
public class Product {

    public static final String JSON_PROPERTY_ID = "id";
    public static final String JSON_PROPERTY_NAME = "name";
    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    public static final String JSON_PROPERTY_PRICE = "price";

    /**
     * ID do produto
     */
    @Nullable(inherited = true)
    @Schema(name = "id", description = "ID do produto", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private Integer id;

    /**
     * Nome do produto
     */
    @NotNull
    @Schema(name = "name", description = "Nome do produto", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_NAME)
    private String name;

    /**
     * Descrição do produto
     */
    @Nullable(inherited = true)
    @Schema(name = "description", description = "Descrição do produto", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private String description;

    /**
     * Preço do produto
     */
    @NotNull
    @Schema(name = "price", description = "Preço do produto", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_PRICE)
    private Float price;

    public Product(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    /**
     * ID do produto
     *
     * @return the id property value
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the id property value
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Set id in a chainable fashion.
     *
     * @return The same instance of Product for chaining.
     */
    public Product id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Nome do produto
     *
     * @return the name property value
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name property value
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set name in a chainable fashion.
     *
     * @return The same instance of Product for chaining.
     */
    public Product name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Descrição do produto
     *
     * @return the description property value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description property value
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Set description in a chainable fashion.
     *
     * @return The same instance of Product for chaining.
     */
    public Product description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Preço do produto
     *
     * @return the price property value
     */
    public Float getPrice() {
        return price;
    }

    /**
     * Set the price property value
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * Set price in a chainable fashion.
     *
     * @return The same instance of Product for chaining.
     */
    public Product price(Float price) {
        this.price = price;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(id, product.id) &&
            Objects.equals(name, product.name) &&
            Objects.equals(description, product.description) &&
            Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, price);
    }

    @Override
    public String toString() {
        return "Product("
            + "id: " + getId() + ", "
            + "name: " + getName() + ", "
            + "description: " + getDescription() + ", "
            + "price: " + getPrice()
            + ")";
    }

}