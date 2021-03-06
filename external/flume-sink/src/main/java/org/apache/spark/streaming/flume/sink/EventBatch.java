package org.apache.spark.streaming.flume.sink;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class EventBatch extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EventBatch\",\"namespace\":\"org.apache.spark.streaming.flume.sink\",\"fields\":[{\"name\":\"errorMsg\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"sequenceNumber\",\"type\":\"string\"},{\"name\":\"events\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"SparkSinkEvent\",\"fields\":[{\"name\":\"headers\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"body\",\"type\":\"bytes\"}]}}}]}");
    public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
    @Deprecated public CharSequence errorMsg;
    @Deprecated public CharSequence sequenceNumber;
    @Deprecated public java.util.List<org.apache.spark.streaming.flume.sink.SparkSinkEvent> events;
    
    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public EventBatch() {}
    
    /**
     * All-args constructor.
     */
    public EventBatch(CharSequence errorMsg, CharSequence sequenceNumber, java.util.List<org.apache.spark.streaming.flume.sink.SparkSinkEvent> events) {
        this.errorMsg = errorMsg;
        this.sequenceNumber = sequenceNumber;
        this.events = events;
    }
    
    public org.apache.avro.Schema getSchema() { return SCHEMA$; }
    // Used by DatumWriter.  Applications should not call.
    public Object get(int field$) {
        switch (field$) {
            case 0: return errorMsg;
            case 1: return sequenceNumber;
            case 2: return events;
            default: throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }
    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value="unchecked")
    public void put(int field$, Object value$) {
        switch (field$) {
            case 0: errorMsg = (CharSequence)value$; break;
            case 1: sequenceNumber = (CharSequence)value$; break;
            case 2: events = (java.util.List<org.apache.spark.streaming.flume.sink.SparkSinkEvent>)value$; break;
            default: throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }
    
    /**
     * Gets the value of the 'errorMsg' field.
     */
    public CharSequence getErrorMsg() {
        return errorMsg;
    }
    
    /**
     * Sets the value of the 'errorMsg' field.
     * @param value the value to set.
     */
    public void setErrorMsg(CharSequence value) {
        this.errorMsg = value;
    }
    
    /**
     * Gets the value of the 'sequenceNumber' field.
     */
    public CharSequence getSequenceNumber() {
        return sequenceNumber;
    }
    
    /**
     * Sets the value of the 'sequenceNumber' field.
     * @param value the value to set.
     */
    public void setSequenceNumber(CharSequence value) {
        this.sequenceNumber = value;
    }
    
    /**
     * Gets the value of the 'events' field.
     */
    public java.util.List<org.apache.spark.streaming.flume.sink.SparkSinkEvent> getEvents() {
        return events;
    }
    
    /**
     * Sets the value of the 'events' field.
     * @param value the value to set.
     */
    public void setEvents(java.util.List<org.apache.spark.streaming.flume.sink.SparkSinkEvent> value) {
        this.events = value;
    }
    
    /** Creates a new EventBatch RecordBuilder */
    public static org.apache.spark.streaming.flume.sink.EventBatch.Builder newBuilder() {
        return new org.apache.spark.streaming.flume.sink.EventBatch.Builder();
    }
    
    /** Creates a new EventBatch RecordBuilder by copying an existing Builder */
    public static org.apache.spark.streaming.flume.sink.EventBatch.Builder newBuilder(org.apache.spark.streaming.flume.sink.EventBatch.Builder other) {
        return new org.apache.spark.streaming.flume.sink.EventBatch.Builder(other);
    }
    
    /** Creates a new EventBatch RecordBuilder by copying an existing EventBatch instance */
    public static org.apache.spark.streaming.flume.sink.EventBatch.Builder newBuilder(org.apache.spark.streaming.flume.sink.EventBatch other) {
        return new org.apache.spark.streaming.flume.sink.EventBatch.Builder(other);
    }
    
    /**
     * RecordBuilder for EventBatch instances.
     */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EventBatch>
            implements org.apache.avro.data.RecordBuilder<EventBatch> {
        
        private CharSequence errorMsg;
        private CharSequence sequenceNumber;
        private java.util.List<org.apache.spark.streaming.flume.sink.SparkSinkEvent> events;
        
        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$);
        }
        
        /** Creates a Builder by copying an existing Builder */
        private Builder(org.apache.spark.streaming.flume.sink.EventBatch.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.errorMsg)) {
                this.errorMsg = data().deepCopy(fields()[0].schema(), other.errorMsg);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.sequenceNumber)) {
                this.sequenceNumber = data().deepCopy(fields()[1].schema(), other.sequenceNumber);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.events)) {
                this.events = data().deepCopy(fields()[2].schema(), other.events);
                fieldSetFlags()[2] = true;
            }
        }
        
        /** Creates a Builder by copying an existing EventBatch instance */
        private Builder(org.apache.spark.streaming.flume.sink.EventBatch other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.errorMsg)) {
                this.errorMsg = data().deepCopy(fields()[0].schema(), other.errorMsg);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.sequenceNumber)) {
                this.sequenceNumber = data().deepCopy(fields()[1].schema(), other.sequenceNumber);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.events)) {
                this.events = data().deepCopy(fields()[2].schema(), other.events);
                fieldSetFlags()[2] = true;
            }
        }
        
        /** Gets the value of the 'errorMsg' field */
        public CharSequence getErrorMsg() {
            return errorMsg;
        }
        
        /** Sets the value of the 'errorMsg' field */
        public org.apache.spark.streaming.flume.sink.EventBatch.Builder setErrorMsg(CharSequence value) {
            validate(fields()[0], value);
            this.errorMsg = value;
            fieldSetFlags()[0] = true;
            return this;
        }
        
        /** Checks whether the 'errorMsg' field has been set */
        public boolean hasErrorMsg() {
            return fieldSetFlags()[0];
        }
        
        /** Clears the value of the 'errorMsg' field */
        public org.apache.spark.streaming.flume.sink.EventBatch.Builder clearErrorMsg() {
            errorMsg = null;
            fieldSetFlags()[0] = false;
            return this;
        }
        
        /** Gets the value of the 'sequenceNumber' field */
        public CharSequence getSequenceNumber() {
            return sequenceNumber;
        }
        
        /** Sets the value of the 'sequenceNumber' field */
        public org.apache.spark.streaming.flume.sink.EventBatch.Builder setSequenceNumber(CharSequence value) {
            validate(fields()[1], value);
            this.sequenceNumber = value;
            fieldSetFlags()[1] = true;
            return this;
        }
        
        /** Checks whether the 'sequenceNumber' field has been set */
        public boolean hasSequenceNumber() {
            return fieldSetFlags()[1];
        }
        
        /** Clears the value of the 'sequenceNumber' field */
        public org.apache.spark.streaming.flume.sink.EventBatch.Builder clearSequenceNumber() {
            sequenceNumber = null;
            fieldSetFlags()[1] = false;
            return this;
        }
        
        /** Gets the value of the 'events' field */
        public java.util.List<org.apache.spark.streaming.flume.sink.SparkSinkEvent> getEvents() {
            return events;
        }
        
        /** Sets the value of the 'events' field */
        public org.apache.spark.streaming.flume.sink.EventBatch.Builder setEvents(java.util.List<org.apache.spark.streaming.flume.sink.SparkSinkEvent> value) {
            validate(fields()[2], value);
            this.events = value;
            fieldSetFlags()[2] = true;
            return this;
        }
        
        /** Checks whether the 'events' field has been set */
        public boolean hasEvents() {
            return fieldSetFlags()[2];
        }
        
        /** Clears the value of the 'events' field */
        public org.apache.spark.streaming.flume.sink.EventBatch.Builder clearEvents() {
            events = null;
            fieldSetFlags()[2] = false;
            return this;
        }
        
        @Override
        public EventBatch build() {
            try {
                EventBatch record = new EventBatch();
                record.errorMsg = fieldSetFlags()[0] ? this.errorMsg : (CharSequence) defaultValue(fields()[0]);
                record.sequenceNumber = fieldSetFlags()[1] ? this.sequenceNumber : (CharSequence) defaultValue(fields()[1]);
                record.events = fieldSetFlags()[2] ? this.events : (java.util.List<org.apache.spark.streaming.flume.sink.SparkSinkEvent>) defaultValue(fields()[2]);
                return record;
            } catch (Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }
}