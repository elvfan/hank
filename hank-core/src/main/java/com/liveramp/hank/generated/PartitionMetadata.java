/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.liveramp.hank.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PartitionMetadata implements org.apache.thrift.TBase<PartitionMetadata, PartitionMetadata._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PartitionMetadata");

  private static final org.apache.thrift.protocol.TField NUM_BYTES_FIELD_DESC = new org.apache.thrift.protocol.TField("num_bytes", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField NUM_RECORDS_FIELD_DESC = new org.apache.thrift.protocol.TField("num_records", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PartitionMetadataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PartitionMetadataTupleSchemeFactory());
  }

  public long num_bytes; // required
  public long num_records; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NUM_BYTES((short)1, "num_bytes"),
    NUM_RECORDS((short)2, "num_records");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NUM_BYTES
          return NUM_BYTES;
        case 2: // NUM_RECORDS
          return NUM_RECORDS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __NUM_BYTES_ISSET_ID = 0;
  private static final int __NUM_RECORDS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NUM_BYTES, new org.apache.thrift.meta_data.FieldMetaData("num_bytes", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NUM_RECORDS, new org.apache.thrift.meta_data.FieldMetaData("num_records", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PartitionMetadata.class, metaDataMap);
  }

  public PartitionMetadata() {
  }

  public PartitionMetadata(
    long num_bytes,
    long num_records)
  {
    this();
    this.num_bytes = num_bytes;
    set_num_bytes_isSet(true);
    this.num_records = num_records;
    set_num_records_isSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PartitionMetadata(PartitionMetadata other) {
    __isset_bitfield = other.__isset_bitfield;
    this.num_bytes = other.num_bytes;
    this.num_records = other.num_records;
  }

  public PartitionMetadata deepCopy() {
    return new PartitionMetadata(this);
  }

  @Override
  public void clear() {
    set_num_bytes_isSet(false);
    this.num_bytes = 0;
    set_num_records_isSet(false);
    this.num_records = 0;
  }

  public long get_num_bytes() {
    return this.num_bytes;
  }

  public PartitionMetadata set_num_bytes(long num_bytes) {
    this.num_bytes = num_bytes;
    set_num_bytes_isSet(true);
    return this;
  }

  public void unset_num_bytes() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUM_BYTES_ISSET_ID);
  }

  /** Returns true if field num_bytes is set (has been assigned a value) and false otherwise */
  public boolean is_set_num_bytes() {
    return EncodingUtils.testBit(__isset_bitfield, __NUM_BYTES_ISSET_ID);
  }

  public void set_num_bytes_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUM_BYTES_ISSET_ID, value);
  }

  public long get_num_records() {
    return this.num_records;
  }

  public PartitionMetadata set_num_records(long num_records) {
    this.num_records = num_records;
    set_num_records_isSet(true);
    return this;
  }

  public void unset_num_records() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUM_RECORDS_ISSET_ID);
  }

  /** Returns true if field num_records is set (has been assigned a value) and false otherwise */
  public boolean is_set_num_records() {
    return EncodingUtils.testBit(__isset_bitfield, __NUM_RECORDS_ISSET_ID);
  }

  public void set_num_records_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUM_RECORDS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NUM_BYTES:
      if (value == null) {
        unset_num_bytes();
      } else {
        set_num_bytes((Long)value);
      }
      break;

    case NUM_RECORDS:
      if (value == null) {
        unset_num_records();
      } else {
        set_num_records((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NUM_BYTES:
      return Long.valueOf(get_num_bytes());

    case NUM_RECORDS:
      return Long.valueOf(get_num_records());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NUM_BYTES:
      return is_set_num_bytes();
    case NUM_RECORDS:
      return is_set_num_records();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PartitionMetadata)
      return this.equals((PartitionMetadata)that);
    return false;
  }

  public boolean equals(PartitionMetadata that) {
    if (that == null)
      return false;

    boolean this_present_num_bytes = true;
    boolean that_present_num_bytes = true;
    if (this_present_num_bytes || that_present_num_bytes) {
      if (!(this_present_num_bytes && that_present_num_bytes))
        return false;
      if (this.num_bytes != that.num_bytes)
        return false;
    }

    boolean this_present_num_records = true;
    boolean that_present_num_records = true;
    if (this_present_num_records || that_present_num_records) {
      if (!(this_present_num_records && that_present_num_records))
        return false;
      if (this.num_records != that.num_records)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_num_bytes = true;
    builder.append(present_num_bytes);
    if (present_num_bytes)
      builder.append(num_bytes);

    boolean present_num_records = true;
    builder.append(present_num_records);
    if (present_num_records)
      builder.append(num_records);

    return builder.toHashCode();
  }

  public int compareTo(PartitionMetadata other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    PartitionMetadata typedOther = (PartitionMetadata)other;

    lastComparison = Boolean.valueOf(is_set_num_bytes()).compareTo(typedOther.is_set_num_bytes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_num_bytes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_bytes, typedOther.num_bytes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_num_records()).compareTo(typedOther.is_set_num_records());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_num_records()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_records, typedOther.num_records);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PartitionMetadata(");
    boolean first = true;

    sb.append("num_bytes:");
    sb.append(this.num_bytes);
    first = false;
    if (!first) sb.append(", ");
    sb.append("num_records:");
    sb.append(this.num_records);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'num_bytes' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'num_records' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PartitionMetadataStandardSchemeFactory implements SchemeFactory {
    public PartitionMetadataStandardScheme getScheme() {
      return new PartitionMetadataStandardScheme();
    }
  }

  private static class PartitionMetadataStandardScheme extends StandardScheme<PartitionMetadata> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PartitionMetadata struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NUM_BYTES
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.num_bytes = iprot.readI64();
              struct.set_num_bytes_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NUM_RECORDS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.num_records = iprot.readI64();
              struct.set_num_records_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.is_set_num_bytes()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'num_bytes' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.is_set_num_records()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'num_records' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PartitionMetadata struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(NUM_BYTES_FIELD_DESC);
      oprot.writeI64(struct.num_bytes);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NUM_RECORDS_FIELD_DESC);
      oprot.writeI64(struct.num_records);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PartitionMetadataTupleSchemeFactory implements SchemeFactory {
    public PartitionMetadataTupleScheme getScheme() {
      return new PartitionMetadataTupleScheme();
    }
  }

  private static class PartitionMetadataTupleScheme extends TupleScheme<PartitionMetadata> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PartitionMetadata struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.num_bytes);
      oprot.writeI64(struct.num_records);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PartitionMetadata struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.num_bytes = iprot.readI64();
      struct.set_num_bytes_isSet(true);
      struct.num_records = iprot.readI64();
      struct.set_num_records_isSet(true);
    }
  }

}

