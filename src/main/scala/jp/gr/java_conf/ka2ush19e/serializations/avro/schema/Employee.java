/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package jp.gr.java_conf.ka2ush19e.serializations.avro.schema;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Employee extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Employee\",\"namespace\":\"jp.gr.java_conf.ka2ush19e.serializations.avro.schema\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"job\",\"type\":{\"type\":\"enum\",\"name\":\"Job\",\"symbols\":[\"Sales\",\"Engineer\",\"Analyst\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Job job;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Employee() {}

  /**
   * All-args constructor.
   */
  public Employee(java.lang.CharSequence name, jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Job job) {
    this.name = name;
    this.job = job;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return job;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: job = (jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Job)value$; break;
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
   * Gets the value of the 'job' field.
   */
  public jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Job getJob() {
    return job;
  }

  /**
   * Sets the value of the 'job' field.
   * @param value the value to set.
   */
  public void setJob(jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Job value) {
    this.job = value;
  }

  /** Creates a new Employee RecordBuilder */
  public static jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Employee.Builder newBuilder() {
    return new jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Employee.Builder();
  }
  
  /** Creates a new Employee RecordBuilder by copying an existing Builder */
  public static jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Employee.Builder newBuilder(jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Employee.Builder other) {
    return new jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Employee.Builder(other);
  }
  
  /** Creates a new Employee RecordBuilder by copying an existing Employee instance */
  public static jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Employee.Builder newBuilder(jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Employee other) {
    return new jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Employee.Builder(other);
  }
  
  /**
   * RecordBuilder for Employee instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Employee>
    implements org.apache.avro.data.RecordBuilder<Employee> {

    private java.lang.CharSequence name;
    private jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Job job;

    /** Creates a new Builder */
    private Builder() {
      super(jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Employee.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Employee.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.job)) {
        this.job = data().deepCopy(fields()[1].schema(), other.job);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Employee instance */
    private Builder(jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Employee other) {
            super(jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Employee.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.job)) {
        this.job = data().deepCopy(fields()[1].schema(), other.job);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Employee.Builder setName(java.lang.CharSequence value) {
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
    public jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Employee.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'job' field */
    public jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Job getJob() {
      return job;
    }
    
    /** Sets the value of the 'job' field */
    public jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Employee.Builder setJob(jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Job value) {
      validate(fields()[1], value);
      this.job = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'job' field has been set */
    public boolean hasJob() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'job' field */
    public jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Employee.Builder clearJob() {
      job = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Employee build() {
      try {
        Employee record = new Employee();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.job = fieldSetFlags()[1] ? this.job : (jp.gr.java_conf.ka2ush19e.serializations.avro.schema.Job) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
