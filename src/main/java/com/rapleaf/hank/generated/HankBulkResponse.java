/**
 * Autogenerated by Thrift Compiler (0.8.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.rapleaf.hank.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
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

public class HankBulkResponse extends org.apache.thrift.TUnion<HankBulkResponse, HankBulkResponse._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HankBulkResponse");
  private static final org.apache.thrift.protocol.TField RESPONSES_FIELD_DESC = new org.apache.thrift.protocol.TField("responses", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField XCEPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("xception", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESPONSES((short)1, "responses"),
    XCEPTION((short)2, "xception");

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
        case 1: // RESPONSES
          return RESPONSES;
        case 2: // XCEPTION
          return XCEPTION;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESPONSES, new org.apache.thrift.meta_data.FieldMetaData("responses", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, HankResponse.class))));
    tmpMap.put(_Fields.XCEPTION, new org.apache.thrift.meta_data.FieldMetaData("xception", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, HankException.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HankBulkResponse.class, metaDataMap);
  }

  public HankBulkResponse() {
    super();
  }

  public HankBulkResponse(_Fields setField, Object value) {
    super(setField, value);
  }

  public HankBulkResponse(HankBulkResponse other) {
    super(other);
  }
  public HankBulkResponse deepCopy() {
    return new HankBulkResponse(this);
  }

  public static HankBulkResponse responses(List<HankResponse> value) {
    HankBulkResponse x = new HankBulkResponse();
    x.set_responses(value);
    return x;
  }

  public static HankBulkResponse xception(HankException value) {
    HankBulkResponse x = new HankBulkResponse();
    x.set_xception(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case RESPONSES:
        if (value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List<HankResponse> for field 'responses', but got " + value.getClass().getSimpleName());
      case XCEPTION:
        if (value instanceof HankException) {
          break;
        }
        throw new ClassCastException("Was expecting value of type HankException for field 'xception', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case RESPONSES:
          if (field.type == RESPONSES_FIELD_DESC.type) {
            List<HankResponse> responses;
            {
              org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
              responses = new ArrayList<HankResponse>(_list0.size);
              for (int _i1 = 0; _i1 < _list0.size; ++_i1)
              {
                HankResponse _elem2; // required
                _elem2 = new HankResponse();
                _elem2.read(iprot);
                responses.add(_elem2);
              }
              iprot.readListEnd();
            }
            return responses;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case XCEPTION:
          if (field.type == XCEPTION_FIELD_DESC.type) {
            HankException xception;
            xception = new HankException();
            xception.read(iprot);
            return xception;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case RESPONSES:
        List<HankResponse> responses = (List<HankResponse>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, responses.size()));
          for (HankResponse _iter3 : responses)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        return;
      case XCEPTION:
        HankException xception = (HankException)value_;
        xception.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case RESPONSES:
          List<HankResponse> responses;
          {
            org.apache.thrift.protocol.TList _list4 = iprot.readListBegin();
            responses = new ArrayList<HankResponse>(_list4.size);
            for (int _i5 = 0; _i5 < _list4.size; ++_i5)
            {
              HankResponse _elem6; // required
              _elem6 = new HankResponse();
              _elem6.read(iprot);
              responses.add(_elem6);
            }
            iprot.readListEnd();
          }
          return responses;
        case XCEPTION:
          HankException xception;
          xception = new HankException();
          xception.read(iprot);
          return xception;
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      return null;
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case RESPONSES:
        List<HankResponse> responses = (List<HankResponse>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, responses.size()));
          for (HankResponse _iter7 : responses)
          {
            _iter7.write(oprot);
          }
          oprot.writeListEnd();
        }
        return;
      case XCEPTION:
        HankException xception = (HankException)value_;
        xception.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case RESPONSES:
        return RESPONSES_FIELD_DESC;
      case XCEPTION:
        return XCEPTION_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public List<HankResponse> get_responses() {
    if (getSetField() == _Fields.RESPONSES) {
      return (List<HankResponse>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'responses' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void set_responses(List<HankResponse> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.RESPONSES;
    value_ = value;
  }

  public HankException get_xception() {
    if (getSetField() == _Fields.XCEPTION) {
      return (HankException)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'xception' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void set_xception(HankException value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.XCEPTION;
    value_ = value;
  }

  public boolean is_set_responses() {
    return setField_ == _Fields.RESPONSES;
  }


  public boolean is_set_xception() {
    return setField_ == _Fields.XCEPTION;
  }


  public boolean equals(Object other) {
    if (other instanceof HankBulkResponse) {
      return equals((HankBulkResponse)other);
    } else {
      return false;
    }
  }

  public boolean equals(HankBulkResponse other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(HankBulkResponse other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    HashCodeBuilder hcb = new HashCodeBuilder();
    hcb.append(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      hcb.append(setField.getThriftFieldId());
      Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        hcb.append(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        hcb.append(value);
      }
    }
    return hcb.toHashCode();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}