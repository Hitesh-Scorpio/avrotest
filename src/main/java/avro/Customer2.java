/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Customer2 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8880857840018287421L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Customer2\",\"namespace\":\"avro\",\"fields\":[{\"name\":\"x\",\"type\":\"string\"},{\"name\":\"y\",\"type\":\"string\"},{\"name\":\"address\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AddressRecord\",\"fields\":[{\"name\":\"streetaddress\",\"type\":\"string\"},{\"name\":\"city\",\"type\":\"string\"},{\"name\":\"state\",\"type\":\"string\"},{\"name\":\"zip\",\"type\":\"string\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Customer2> ENCODER =
      new BinaryMessageEncoder<Customer2>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Customer2> DECODER =
      new BinaryMessageDecoder<Customer2>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Customer2> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Customer2> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Customer2>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Customer2 to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Customer2 from a ByteBuffer. */
  public static Customer2 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence x;
  @Deprecated public java.lang.CharSequence y;
  @Deprecated public java.util.List<avro.AddressRecord> address;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Customer2() {}

  /**
   * All-args constructor.
   * @param x The new value for x
   * @param y The new value for y
   * @param address The new value for address
   */
  public Customer2(java.lang.CharSequence x, java.lang.CharSequence y, java.util.List<avro.AddressRecord> address) {
    this.x = x;
    this.y = y;
    this.address = address;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return x;
    case 1: return y;
    case 2: return address;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: x = (java.lang.CharSequence)value$; break;
    case 1: y = (java.lang.CharSequence)value$; break;
    case 2: address = (java.util.List<avro.AddressRecord>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'x' field.
   * @return The value of the 'x' field.
   */
  public java.lang.CharSequence getX() {
    return x;
  }

  /**
   * Sets the value of the 'x' field.
   * @param value the value to set.
   */
  public void setX(java.lang.CharSequence value) {
    this.x = value;
  }

  /**
   * Gets the value of the 'y' field.
   * @return The value of the 'y' field.
   */
  public java.lang.CharSequence getY() {
    return y;
  }

  /**
   * Sets the value of the 'y' field.
   * @param value the value to set.
   */
  public void setY(java.lang.CharSequence value) {
    this.y = value;
  }

  /**
   * Gets the value of the 'address' field.
   * @return The value of the 'address' field.
   */
  public java.util.List<avro.AddressRecord> getAddress() {
    return address;
  }

  /**
   * Sets the value of the 'address' field.
   * @param value the value to set.
   */
  public void setAddress(java.util.List<avro.AddressRecord> value) {
    this.address = value;
  }

  /**
   * Creates a new Customer2 RecordBuilder.
   * @return A new Customer2 RecordBuilder
   */
  public static avro.Customer2.Builder newBuilder() {
    return new avro.Customer2.Builder();
  }

  /**
   * Creates a new Customer2 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Customer2 RecordBuilder
   */
  public static avro.Customer2.Builder newBuilder(avro.Customer2.Builder other) {
    return new avro.Customer2.Builder(other);
  }

  /**
   * Creates a new Customer2 RecordBuilder by copying an existing Customer2 instance.
   * @param other The existing instance to copy.
   * @return A new Customer2 RecordBuilder
   */
  public static avro.Customer2.Builder newBuilder(avro.Customer2 other) {
    return new avro.Customer2.Builder(other);
  }

  /**
   * RecordBuilder for Customer2 instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Customer2>
    implements org.apache.avro.data.RecordBuilder<Customer2> {

    private java.lang.CharSequence x;
    private java.lang.CharSequence y;
    private java.util.List<avro.AddressRecord> address;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro.Customer2.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.x)) {
        this.x = data().deepCopy(fields()[0].schema(), other.x);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.y)) {
        this.y = data().deepCopy(fields()[1].schema(), other.y);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.address)) {
        this.address = data().deepCopy(fields()[2].schema(), other.address);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Customer2 instance
     * @param other The existing instance to copy.
     */
    private Builder(avro.Customer2 other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.x)) {
        this.x = data().deepCopy(fields()[0].schema(), other.x);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.y)) {
        this.y = data().deepCopy(fields()[1].schema(), other.y);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.address)) {
        this.address = data().deepCopy(fields()[2].schema(), other.address);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'x' field.
      * @return The value.
      */
    public java.lang.CharSequence getX() {
      return x;
    }

    /**
      * Sets the value of the 'x' field.
      * @param value The value of 'x'.
      * @return This builder.
      */
    public avro.Customer2.Builder setX(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.x = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'x' field has been set.
      * @return True if the 'x' field has been set, false otherwise.
      */
    public boolean hasX() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'x' field.
      * @return This builder.
      */
    public avro.Customer2.Builder clearX() {
      x = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'y' field.
      * @return The value.
      */
    public java.lang.CharSequence getY() {
      return y;
    }

    /**
      * Sets the value of the 'y' field.
      * @param value The value of 'y'.
      * @return This builder.
      */
    public avro.Customer2.Builder setY(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.y = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'y' field has been set.
      * @return True if the 'y' field has been set, false otherwise.
      */
    public boolean hasY() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'y' field.
      * @return This builder.
      */
    public avro.Customer2.Builder clearY() {
      y = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'address' field.
      * @return The value.
      */
    public java.util.List<avro.AddressRecord> getAddress() {
      return address;
    }

    /**
      * Sets the value of the 'address' field.
      * @param value The value of 'address'.
      * @return This builder.
      */
    public avro.Customer2.Builder setAddress(java.util.List<avro.AddressRecord> value) {
      validate(fields()[2], value);
      this.address = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'address' field has been set.
      * @return True if the 'address' field has been set, false otherwise.
      */
    public boolean hasAddress() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'address' field.
      * @return This builder.
      */
    public avro.Customer2.Builder clearAddress() {
      address = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Customer2 build() {
      try {
        Customer2 record = new Customer2();
        record.x = fieldSetFlags()[0] ? this.x : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.y = fieldSetFlags()[1] ? this.y : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.address = fieldSetFlags()[2] ? this.address : (java.util.List<avro.AddressRecord>) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Customer2>
    WRITER$ = (org.apache.avro.io.DatumWriter<Customer2>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Customer2>
    READER$ = (org.apache.avro.io.DatumReader<Customer2>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}