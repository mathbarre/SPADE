/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package spade.storage.kafka;  
@SuppressWarnings("all")
/** A generic object which can be either a vertex or an edge */
@org.apache.avro.specific.AvroGenerated
public class SpadeObject extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SpadeObject\",\"namespace\":\"spade.storage.kafka\",\"doc\":\"A generic object which can be either a vertex or an edge\",\"fields\":[{\"name\":\"annotations\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}]},{\"name\":\"sourceVertexHash\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"destinationVertexHash\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"hash\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.Map<java.lang.String,java.lang.String> annotations;
  @Deprecated public java.lang.String sourceVertexHash;
  @Deprecated public java.lang.String destinationVertexHash;
  @Deprecated public java.lang.String hash;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public SpadeObject() {}

  /**
   * All-args constructor.
   */
  public SpadeObject(java.util.Map<java.lang.String,java.lang.String> annotations, java.lang.String sourceVertexHash, java.lang.String destinationVertexHash, java.lang.String hash) {
    this.annotations = annotations;
    this.sourceVertexHash = sourceVertexHash;
    this.destinationVertexHash = destinationVertexHash;
    this.hash = hash;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return annotations;
    case 1: return sourceVertexHash;
    case 2: return destinationVertexHash;
    case 3: return hash;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: annotations = (java.util.Map<java.lang.String,java.lang.String>)value$; break;
    case 1: sourceVertexHash = (java.lang.String)value$; break;
    case 2: destinationVertexHash = (java.lang.String)value$; break;
    case 3: hash = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'annotations' field.
   */
  public java.util.Map<java.lang.String,java.lang.String> getAnnotations() {
    return annotations;
  }

  /**
   * Sets the value of the 'annotations' field.
   * @param value the value to set.
   */
  public void setAnnotations(java.util.Map<java.lang.String,java.lang.String> value) {
    this.annotations = value;
  }

  /**
   * Gets the value of the 'sourceVertexHash' field.
   */
  public java.lang.String getSourceVertexHash() {
    return sourceVertexHash;
  }

  /**
   * Sets the value of the 'sourceVertexHash' field.
   * @param value the value to set.
   */
  public void setSourceVertexHash(java.lang.String value) {
    this.sourceVertexHash = value;
  }

  /**
   * Gets the value of the 'destinationVertexHash' field.
   */
  public java.lang.String getDestinationVertexHash() {
    return destinationVertexHash;
  }

  /**
   * Sets the value of the 'destinationVertexHash' field.
   * @param value the value to set.
   */
  public void setDestinationVertexHash(java.lang.String value) {
    this.destinationVertexHash = value;
  }

  /**
   * Gets the value of the 'hash' field.
   */
  public java.lang.String getHash() {
    return hash;
  }

  /**
   * Sets the value of the 'hash' field.
   * @param value the value to set.
   */
  public void setHash(java.lang.String value) {
    this.hash = value;
  }

  /** Creates a new SpadeObject RecordBuilder */
  public static spade.storage.kafka.SpadeObject.Builder newBuilder() {
    return new spade.storage.kafka.SpadeObject.Builder();
  }
  
  /** Creates a new SpadeObject RecordBuilder by copying an existing Builder */
  public static spade.storage.kafka.SpadeObject.Builder newBuilder(spade.storage.kafka.SpadeObject.Builder other) {
    return new spade.storage.kafka.SpadeObject.Builder(other);
  }
  
  /** Creates a new SpadeObject RecordBuilder by copying an existing SpadeObject instance */
  public static spade.storage.kafka.SpadeObject.Builder newBuilder(spade.storage.kafka.SpadeObject other) {
    return new spade.storage.kafka.SpadeObject.Builder(other);
  }
  
  /**
   * RecordBuilder for SpadeObject instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SpadeObject>
    implements org.apache.avro.data.RecordBuilder<SpadeObject> {

    private java.util.Map<java.lang.String,java.lang.String> annotations;
    private java.lang.String sourceVertexHash;
    private java.lang.String destinationVertexHash;
    private java.lang.String hash;

    /** Creates a new Builder */
    private Builder() {
      super(spade.storage.kafka.SpadeObject.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(spade.storage.kafka.SpadeObject.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.annotations)) {
        this.annotations = data().deepCopy(fields()[0].schema(), other.annotations);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sourceVertexHash)) {
        this.sourceVertexHash = data().deepCopy(fields()[1].schema(), other.sourceVertexHash);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.destinationVertexHash)) {
        this.destinationVertexHash = data().deepCopy(fields()[2].schema(), other.destinationVertexHash);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.hash)) {
        this.hash = data().deepCopy(fields()[3].schema(), other.hash);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing SpadeObject instance */
    private Builder(spade.storage.kafka.SpadeObject other) {
            super(spade.storage.kafka.SpadeObject.SCHEMA$);
      if (isValidValue(fields()[0], other.annotations)) {
        this.annotations = data().deepCopy(fields()[0].schema(), other.annotations);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sourceVertexHash)) {
        this.sourceVertexHash = data().deepCopy(fields()[1].schema(), other.sourceVertexHash);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.destinationVertexHash)) {
        this.destinationVertexHash = data().deepCopy(fields()[2].schema(), other.destinationVertexHash);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.hash)) {
        this.hash = data().deepCopy(fields()[3].schema(), other.hash);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'annotations' field */
    public java.util.Map<java.lang.String,java.lang.String> getAnnotations() {
      return annotations;
    }
    
    /** Sets the value of the 'annotations' field */
    public spade.storage.kafka.SpadeObject.Builder setAnnotations(java.util.Map<java.lang.String,java.lang.String> value) {
      validate(fields()[0], value);
      this.annotations = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'annotations' field has been set */
    public boolean hasAnnotations() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'annotations' field */
    public spade.storage.kafka.SpadeObject.Builder clearAnnotations() {
      annotations = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'sourceVertexHash' field */
    public java.lang.String getSourceVertexHash() {
      return sourceVertexHash;
    }
    
    /** Sets the value of the 'sourceVertexHash' field */
    public spade.storage.kafka.SpadeObject.Builder setSourceVertexHash(java.lang.String value) {
      validate(fields()[1], value);
      this.sourceVertexHash = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'sourceVertexHash' field has been set */
    public boolean hasSourceVertexHash() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'sourceVertexHash' field */
    public spade.storage.kafka.SpadeObject.Builder clearSourceVertexHash() {
      sourceVertexHash = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'destinationVertexHash' field */
    public java.lang.String getDestinationVertexHash() {
      return destinationVertexHash;
    }
    
    /** Sets the value of the 'destinationVertexHash' field */
    public spade.storage.kafka.SpadeObject.Builder setDestinationVertexHash(java.lang.String value) {
      validate(fields()[2], value);
      this.destinationVertexHash = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'destinationVertexHash' field has been set */
    public boolean hasDestinationVertexHash() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'destinationVertexHash' field */
    public spade.storage.kafka.SpadeObject.Builder clearDestinationVertexHash() {
      destinationVertexHash = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'hash' field */
    public java.lang.String getHash() {
      return hash;
    }
    
    /** Sets the value of the 'hash' field */
    public spade.storage.kafka.SpadeObject.Builder setHash(java.lang.String value) {
      validate(fields()[3], value);
      this.hash = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'hash' field has been set */
    public boolean hasHash() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'hash' field */
    public spade.storage.kafka.SpadeObject.Builder clearHash() {
      hash = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public SpadeObject build() {
      try {
        SpadeObject record = new SpadeObject();
        record.annotations = fieldSetFlags()[0] ? this.annotations : (java.util.Map<java.lang.String,java.lang.String>) defaultValue(fields()[0]);
        record.sourceVertexHash = fieldSetFlags()[1] ? this.sourceVertexHash : (java.lang.String) defaultValue(fields()[1]);
        record.destinationVertexHash = fieldSetFlags()[2] ? this.destinationVertexHash : (java.lang.String) defaultValue(fields()[2]);
        record.hash = fieldSetFlags()[3] ? this.hash : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
