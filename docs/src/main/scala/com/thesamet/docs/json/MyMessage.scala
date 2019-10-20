// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.thesamet.docs.json

@SerialVersionUID(0L)
final case class MyMessage(
    x: _root_.scala.Int = 0,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[MyMessage] with scalapb.lenses.Updatable[MyMessage] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = x
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(1, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = x
        if (__v != 0) {
          _output__.writeInt32(1, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.thesamet.docs.json.MyMessage = {
      var __x = this.x
      val _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(this.unknownFields)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __x = _input__.readInt32()
          case tag => _unknownFields__.parseField(tag, _input__)
        }
      }
      com.thesamet.docs.json.MyMessage(
          x = __x,
          unknownFields = _unknownFields__.result()
      )
    }
    def withX(__v: _root_.scala.Int): MyMessage = copy(x = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = x
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(x)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.thesamet.docs.json.MyMessage
}

object MyMessage extends scalapb.GeneratedMessageCompanion[com.thesamet.docs.json.MyMessage] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.thesamet.docs.json.MyMessage] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.thesamet.docs.json.MyMessage = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.thesamet.docs.json.MyMessage(
      __fieldsMap.getOrElse(__fields.get(0), 0).asInstanceOf[_root_.scala.Int]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.thesamet.docs.json.MyMessage] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.thesamet.docs.json.MyMessage(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = JsonProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = JsonProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.thesamet.docs.json.MyMessage(
    x = 0
  )
  implicit class MyMessageLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.thesamet.docs.json.MyMessage]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.thesamet.docs.json.MyMessage](_l) {
    def x: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.x)((c_, f_) => c_.copy(x = f_))
  }
  final val X_FIELD_NUMBER = 1
  def of(
    x: _root_.scala.Int,
    unknownFields: _root_.scalapb.UnknownFieldSet
  ): _root_.com.thesamet.docs.json.MyMessage = _root_.com.thesamet.docs.json.MyMessage(
    x,
    unknownFields
  )
}
