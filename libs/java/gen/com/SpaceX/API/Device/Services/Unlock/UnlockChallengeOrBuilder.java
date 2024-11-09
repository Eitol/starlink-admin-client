// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/services/unlock/service.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device.Services.Unlock;

public interface UnlockChallengeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SpaceX.API.Device.Services.Unlock.UnlockChallenge)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string device_id = 1 [json_name = "deviceId"];</code>
   * @return The deviceId.
   */
  java.lang.String getDeviceId();
  /**
   * <code>string device_id = 1 [json_name = "deviceId"];</code>
   * @return The bytes for deviceId.
   */
  com.google.protobuf.ByteString
      getDeviceIdBytes();

  /**
   * <code>bytes nonce = 2 [json_name = "nonce"];</code>
   * @return The nonce.
   */
  com.google.protobuf.ByteString getNonce();

  /**
   * <code>bytes sign_spki = 4 [json_name = "signSpki"];</code>
   * @return The signSpki.
   */
  com.google.protobuf.ByteString getSignSpki();

  /**
   * <code>string grant_keydata = 5 [json_name = "grantKeydata"];</code>
   * @return The grantKeydata.
   */
  java.lang.String getGrantKeydata();
  /**
   * <code>string grant_keydata = 5 [json_name = "grantKeydata"];</code>
   * @return The bytes for grantKeydata.
   */
  com.google.protobuf.ByteString
      getGrantKeydataBytes();

  /**
   * <code>string service_keydata = 6 [json_name = "serviceKeydata"];</code>
   * @return The serviceKeydata.
   */
  java.lang.String getServiceKeydata();
  /**
   * <code>string service_keydata = 6 [json_name = "serviceKeydata"];</code>
   * @return The bytes for serviceKeydata.
   */
  com.google.protobuf.ByteString
      getServiceKeydataBytes();

  /**
   * <code>repeated string authority_grants = 7 [json_name = "authorityGrants"];</code>
   * @return A list containing the authorityGrants.
   */
  java.util.List<java.lang.String>
      getAuthorityGrantsList();
  /**
   * <code>repeated string authority_grants = 7 [json_name = "authorityGrants"];</code>
   * @return The count of authorityGrants.
   */
  int getAuthorityGrantsCount();
  /**
   * <code>repeated string authority_grants = 7 [json_name = "authorityGrants"];</code>
   * @param index The index of the element to return.
   * @return The authorityGrants at the given index.
   */
  java.lang.String getAuthorityGrants(int index);
  /**
   * <code>repeated string authority_grants = 7 [json_name = "authorityGrants"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the authorityGrants at the given index.
   */
  com.google.protobuf.ByteString
      getAuthorityGrantsBytes(int index);
}
