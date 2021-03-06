/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package jp.gr.java_conf.ka2ush19e.serializers.avro.schema;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Company extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Company\",\"namespace\":\"jp.gr.java_conf.ka2ush19e.serializations.avro.schema\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"employees\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Employee\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"job\",\"type\":{\"type\":\"enum\",\"name\":\"Job\",\"symbols\":[\"Sales\",\"Engineer\",\"Analyst\"]}}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.util.List<jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Employee> employees;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Company() {}

  /**
   * All-args constructor.
   */
  public Company(java.lang.CharSequence name, java.util.List<jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Employee> employees) {
    this.name = name;
    this.employees = employees;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return employees;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: employees = (java.util.List<jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Employee>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'employees' field.
   */
  public java.util.List<jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Employee> getEmployees() {
    return employees;
  }

  /**
   * Sets the value of the 'employees' field.
   * @param value the value to set.
   */
  public void setEmployees(java.util.List<jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Employee> value) {
    this.employees = value;
  }

  /** Creates a new Company RecordBuilder */
  public static jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Company.Builder newBuilder() {
    return new jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Company.Builder();
  }
  
  /** Creates a new Company RecordBuilder by copying an existing Builder */
  public static jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Company.Builder newBuilder(jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Company.Builder other) {
    return new jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Company.Builder(other);
  }
  
  /** Creates a new Company RecordBuilder by copying an existing Company instance */
  public static jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Company.Builder newBuilder(jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Company other) {
    return new jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Company.Builder(other);
  }
  
  /**
   * RecordBuilder for Company instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Company>
    implements org.apache.avro.data.RecordBuilder<Company> {

    private java.lang.CharSequence name;
    private java.util.List<jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Employee> employees;

    /** Creates a new Builder */
    private Builder() {
      super(jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Company.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Company.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.employees)) {
        this.employees = data().deepCopy(fields()[1].schema(), other.employees);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Company instance */
    private Builder(jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Company other) {
            super(jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Company.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.employees)) {
        this.employees = data().deepCopy(fields()[1].schema(), other.employees);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Company.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'name' field */
    public jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Company.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'employees' field */
    public java.util.List<jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Employee> getEmployees() {
      return employees;
    }
    
    /** Sets the value of the 'employees' field */
    public jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Company.Builder setEmployees(java.util.List<jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Employee> value) {
      validate(fields()[1], value);
      this.employees = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'employees' field has been set */
    public boolean hasEmployees() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'employees' field */
    public jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Company.Builder clearEmployees() {
      employees = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Company build() {
      try {
        Company record = new Company();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.employees = fieldSetFlags()[1] ? this.employees : (java.util.List<jp.gr.java_conf.ka2ush19e.serializers.avro.schema.Employee>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
