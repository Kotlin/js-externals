// Generated using ts2kt(https://github.com/Kotlin/ts2kt)
//
// Headers for google-cloud-storage
// 
// Project: https://github.com/GoogleCloudPlatform/google-cloud-node/tree/master/packages/storage
// Package: google-cloud-storage
//
// Contributed by: Pavlos-Petros Tournaris <p.tournaris@gmail.com>

@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("Storage")
package js.externals.firebase.admin.google.cloud.Storage

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external open class Bucket(storage: Storage, name: String) {
    open var acl: Acl = definedExternally
    open fun combine(sources: Array<String>, destination: Array<String>): Promise<dynamic /* JsTuple<File, ApiResponse> */> = definedExternally
    open fun combine(sources: Array<String>, destination: Array<File>): Promise<dynamic /* JsTuple<File, ApiResponse> */> = definedExternally
    open fun combine(sources: Array<File>, destination: Array<String>): Promise<dynamic /* JsTuple<File, ApiResponse> */> = definedExternally
    open fun combine(sources: Array<File>, destination: Array<File>): Promise<dynamic /* JsTuple<File, ApiResponse> */> = definedExternally
    open fun create(config: BucketConfig? = definedExternally /* null */): Promise<dynamic /* JsTuple<Bucket, ApiResponse> */> = definedExternally
    open fun createChannel(id: String, config: ChannelConfig): Promise<dynamic /* JsTuple<Channel, ApiResponse> */> = definedExternally
    open fun delete(): Promise<dynamic /* JsTuple<ApiResponse> */> = definedExternally
    open fun deleteFiles(query: BucketQuery? = definedExternally /* null */): Promise<Unit> = definedExternally
    open fun exists(): Promise<dynamic /* JsTuple<Boolean> */> = definedExternally
    open fun file(name: String, options: BucketFileOptions? = definedExternally /* null */): File = definedExternally
    open fun get(options: BucketGetOptions? = definedExternally /* null */): Promise<dynamic /* JsTuple<Bucket, ApiResponse> */> = definedExternally
    open fun getFiles(query: BucketQuery? = definedExternally /* null */): Promise<dynamic /* JsTuple<Array<File>> */> = definedExternally
    // open fun getFilesStream(query: BucketQuery? = definedExternally /* null */): ReadStream = definedExternally
    open fun getMetadata(): Promise<dynamic /* JsTuple<BucketMetadata, ApiResponse> */> = definedExternally
    open var id: String = definedExternally
    open var iam: Iam = definedExternally
    open fun makePrivate(options: BucketPrivacyOptions? = definedExternally /* null */): Promise<dynamic /* JsTuple<Array<File>> */> = definedExternally
    open fun makePublic(options: BucketPrivacyOptions? = definedExternally /* null */): Promise<dynamic /* JsTuple<Array<File>> */> = definedExternally
    open var metadata: BucketMetadata = definedExternally
    open var name: String = definedExternally
    open fun setMetadata(metadata: BucketMetadata? = definedExternally /* null */): Promise<dynamic /* JsTuple<ApiResponse> */> = definedExternally
    open fun upload(localPath: String, options: UploadOptions? = definedExternally /* null */): Promise<dynamic /* JsTuple<File> */> = definedExternally
}
external interface `T$0` {
    var enabled: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface BucketConfig {
    var coldline: Boolean? get() = definedExternally; set(value) = definedExternally
    var dra: Boolean? get() = definedExternally; set(value) = definedExternally
    var location: String? get() = definedExternally; set(value) = definedExternally
    var multiRegional: Boolean? get() = definedExternally; set(value) = definedExternally
    var nearline: Boolean? get() = definedExternally; set(value) = definedExternally
    var regional: Boolean? get() = definedExternally; set(value) = definedExternally
    var versioning: `T$0`? get() = definedExternally; set(value) = definedExternally
}
external interface BucketFileOptions {
    var generation: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
}
external interface BucketGetOptions {
    var autoCreate: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface BucketMetadata {
    var etag: String? get() = definedExternally; set(value) = definedExternally
    var id: String? get() = definedExternally; set(value) = definedExternally
    var kind: String? get() = definedExternally; set(value) = definedExternally
    var location: String? get() = definedExternally; set(value) = definedExternally
    var metageneration: String? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
    var projectNumber: String? get() = definedExternally; set(value) = definedExternally
    var selfLink: String? get() = definedExternally; set(value) = definedExternally
    var storageClass: String? get() = definedExternally; set(value) = definedExternally
    var timeCreated: String? get() = definedExternally; set(value) = definedExternally
    var updated: String? get() = definedExternally; set(value) = definedExternally
}
external interface BucketPrivacyOptions {
    var includeFiles: Boolean? get() = definedExternally; set(value) = definedExternally
    var force: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface BucketQuery {
    var autoPaginate: Boolean? get() = definedExternally; set(value) = definedExternally
    var delimiter: String? get() = definedExternally; set(value) = definedExternally
    var prefix: String? get() = definedExternally; set(value) = definedExternally
    var maxApiCalls: Number? get() = definedExternally; set(value) = definedExternally
    var maxResults: Number? get() = definedExternally; set(value) = definedExternally
    var pageToken: String? get() = definedExternally; set(value) = definedExternally
    var versions: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface ContentLengthRange {
    var max: Number? get() = definedExternally; set(value) = definedExternally
    var min: Number? get() = definedExternally; set(value) = definedExternally
}
external open class File(bucket: Bucket, name: String, options: BucketFileOptions? = definedExternally /* null */) {
    open var acl: Acl = definedExternally
    open fun copy(destination: String): Promise<dynamic /* JsTuple<File, ApiResponse> */> = definedExternally
    open fun copy(destination: File): Promise<dynamic /* JsTuple<File, ApiResponse> */> = definedExternally
    open fun copy(destination: Bucket): Promise<dynamic /* JsTuple<File, ApiResponse> */> = definedExternally
    // open fun createReadStream(options: ReadStreamOptions? = definedExternally /* null */): ReadStream = definedExternally
    open fun createResumableUpload(options: ResumableUploadOptions? = definedExternally /* null */): Promise<dynamic /* JsTuple<String> */> = definedExternally
    // open fun createWriteStream(options: WriteStreamOptions? = definedExternally /* null */): WriteStream = definedExternally
    open fun delete(): Promise<dynamic /* JsTuple<ApiResponse> */> = definedExternally
    open fun download(options: DownloadOptions? = definedExternally /* null */): Promise<dynamic /* JsTuple<Any> */> = definedExternally
    open fun exists(): Promise<dynamic /* JsTuple<Boolean> */> = definedExternally
    open fun get(): Promise<dynamic /* JsTuple<File, ApiResponse> */> = definedExternally
    open fun getMetadata(): Promise<dynamic /* JsTuple<FileMetadata, ApiResponse> */> = definedExternally
    open fun getSignedPolicy(options: SignedPolicyOptions? = definedExternally /* null */): Promise<dynamic /* JsTuple<SignedPolicy> */> = definedExternally
    open fun getSignedUrl(config: SignedUrlConfig? = definedExternally /* null */): Promise<dynamic /* JsTuple<String> */> = definedExternally
    open fun makePrivate(options: FilePrivateOptions? = definedExternally /* null */): Promise<dynamic /* JsTuple<ApiResponse> */> = definedExternally
    open fun makePublic(): Promise<dynamic /* JsTuple<ApiResponse> */> = definedExternally
    open fun move(destination: String): Promise<dynamic /* JsTuple<File, ApiResponse> */> = definedExternally
    open fun move(destination: File): Promise<dynamic /* JsTuple<File, ApiResponse> */> = definedExternally
    open fun move(destination: Bucket): Promise<dynamic /* JsTuple<File, ApiResponse> */> = definedExternally
    open var name: String = definedExternally
    open fun save(data: String, options: WriteStreamOptions? = definedExternally /* null */): Promise<Unit> = definedExternally
    // open fun save(data: Buffer, options: WriteStreamOptions? = definedExternally /* null */): Promise<Unit> = definedExternally
    open fun setEncryptionKey(encryptionKey: String): File = definedExternally
    // open fun setEncryptionKey(encryptionKey: Buffer): File = definedExternally
    open fun setMetadata(metadata: FileMetadata): Promise<dynamic /* JsTuple<ApiResponse> */> = definedExternally
    open var metadata: FileMetadata = definedExternally
}
external interface CustomFileMetadata {
    @nativeGetter
    operator fun get(key: String): dynamic /* String | Number | Boolean | Nothing? */
    @nativeSetter
    operator fun set(key: String, value: String)
    @nativeSetter
    operator fun set(key: String, value: Number)
    @nativeSetter
    operator fun set(key: String, value: Boolean)
    @nativeSetter
    operator fun set(key: String, value: Nothing?)
}
external interface FileMetadata {
    var contentType: String? get() = definedExternally; set(value) = definedExternally
    var metadata: CustomFileMetadata? get() = definedExternally; set(value) = definedExternally
    var cacheControl: String? get() = definedExternally; set(value) = definedExternally
}
external interface FilePrivateOptions {
    var strict: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface SignedPolicy {
    var base64: String? get() = definedExternally; set(value) = definedExternally
    var signature: String? get() = definedExternally; set(value) = definedExternally
    var string: String? get() = definedExternally; set(value) = definedExternally
}
external interface SignedPolicyOptions {
    var acl: String? get() = definedExternally; set(value) = definedExternally
    var contentLengthRange: ContentLengthRange? get() = definedExternally; set(value) = definedExternally
    var equals: dynamic /* Array<String> | dynamic /* JsTuple<Array<String>> */ */ get() = definedExternally; set(value) = definedExternally
    var expires: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var max: Number? get() = definedExternally; set(value) = definedExternally
    var min: Number? get() = definedExternally; set(value) = definedExternally
    var startsWith: dynamic /* Array<String> | dynamic /* JsTuple<Array<String>> */ */ get() = definedExternally; set(value) = definedExternally
    var successRedirect: String? get() = definedExternally; set(value) = definedExternally
    var successStatus: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$1` {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}
external interface SignedUrlConfig {
    var action: String
    var cname: String? get() = definedExternally; set(value) = definedExternally
    var contentMd5: String? get() = definedExternally; set(value) = definedExternally
    var contentType: String? get() = definedExternally; set(value) = definedExternally
    var expires: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var extensionHeaders: `T$1`? get() = definedExternally; set(value) = definedExternally
    var promptSaveAs: String? get() = definedExternally; set(value) = definedExternally
    var responseDisposition: String? get() = definedExternally; set(value) = definedExternally
    var responseType: String? get() = definedExternally; set(value) = definedExternally
}
external interface ResumableUploadOptions {
    var metadata: FileMetadata? get() = definedExternally; set(value) = definedExternally
    var origin: String? get() = definedExternally; set(value) = definedExternally
    var predefinedAcl: String? get() = definedExternally; set(value) = definedExternally
    var private: Boolean? get() = definedExternally; set(value) = definedExternally
    var public: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface Acl : AclActions {
    var default: AclEntity
    var owners: AclEntity
    var readers: AclEntity
    var writers: AclEntity
}
external interface AclActions {
    fun add(options: AclOptions): Promise<dynamic /* JsTuple<Acl, ApiResponse> */>
    fun delete(options: AclOptions): Promise<dynamic /* JsTuple<Acl, ApiResponse> */>
    fun get(options: AclOptions): Promise<dynamic /* JsTuple<Acl, ApiResponse> */>
    fun update(options: AclOptions): Promise<dynamic /* JsTuple<Acl, ApiResponse> */>
}
external interface AclEntity : AclActions {
    fun addAllAuthenticatedUsers(): Promise<dynamic /* JsTuple<Acl, ApiResponse> */>
    fun addAllUsers(): Promise<dynamic /* JsTuple<Acl, ApiResponse> */>
    fun addDomain(entity: String): Promise<dynamic /* JsTuple<Acl, ApiResponse> */>
    fun addGroup(entity: String): Promise<dynamic /* JsTuple<Acl, ApiResponse> */>
    fun addProject(entity: String): Promise<dynamic /* JsTuple<Acl, ApiResponse> */>
    fun addUser(entity: String): Promise<dynamic /* JsTuple<Acl, ApiResponse> */>
    fun deleteAllAuthenticatedUsers(): Promise<dynamic /* JsTuple<Acl, ApiResponse> */>
    fun deleteAllUsers(): Promise<dynamic /* JsTuple<Acl, ApiResponse> */>
    fun deleteDomain(entity: String): Promise<dynamic /* JsTuple<Acl, ApiResponse> */>
    fun deleteGroup(entity: String): Promise<dynamic /* JsTuple<Acl, ApiResponse> */>
    fun deleteProject(entity: String): Promise<dynamic /* JsTuple<Acl, ApiResponse> */>
    fun deleteUser(entity: String): Promise<dynamic /* JsTuple<Acl, ApiResponse> */>
}
external interface AclOptions {
    var entity: String? get() = definedExternally; set(value) = definedExternally
    var role: String? get() = definedExternally; set(value) = definedExternally
    var generation: Number? get() = definedExternally; set(value) = definedExternally
}
external interface ApiResponse {
    var etag: String? get() = definedExternally; set(value) = definedExternally
    var id: String? get() = definedExternally; set(value) = definedExternally
    var kind: String? get() = definedExternally; set(value) = definedExternally
    var location: String? get() = definedExternally; set(value) = definedExternally
    var metageneration: String? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
    var projectNumber: String? get() = definedExternally; set(value) = definedExternally
    var selfLink: String? get() = definedExternally; set(value) = definedExternally
    var storageClass: String? get() = definedExternally; set(value) = definedExternally
    var timeCreated: String? get() = definedExternally; set(value) = definedExternally
    var updated: String? get() = definedExternally; set(value) = definedExternally
}
external interface Credentials {
    var client_email: String? get() = definedExternally; set(value) = definedExternally
    var private_key: String? get() = definedExternally; set(value) = definedExternally
}
external interface ConfigurationObject {
    var autoRetry: Boolean? get() = definedExternally; set(value) = definedExternally
    var credentials: Credentials? get() = definedExternally; set(value) = definedExternally
    var email: String? get() = definedExternally; set(value) = definedExternally
    var keyFilename: String? get() = definedExternally; set(value) = definedExternally
    var maxRetries: Number? get() = definedExternally; set(value) = definedExternally
    var projectId: String? get() = definedExternally; set(value) = definedExternally
    // var promise: (() -> PromiseLike<Any>)? get() = definedExternally; set(value) = definedExternally
}
external interface DownloadOptions : ReadStreamOptions {
    var destination: String? get() = definedExternally; set(value) = definedExternally
}
external interface ReadStreamOptions {
    var end: Number? get() = definedExternally; set(value) = definedExternally
    var start: Number? get() = definedExternally; set(value) = definedExternally
    var validation: dynamic /* String | Boolean */ get() = definedExternally; set(value) = definedExternally
}
external interface UploadOptions : WriteStreamOptions {
    var destination: String? get() = definedExternally; set(value) = definedExternally
}
external interface WriteStreamOptions {
    var gzip: Boolean? get() = definedExternally; set(value) = definedExternally
    var metadata: FileMetadata? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var predefinedAcl: String? get() = definedExternally; set(value) = definedExternally
    var private: Boolean? get() = definedExternally; set(value) = definedExternally
    var public: Boolean? get() = definedExternally; set(value) = definedExternally
    var resumable: Boolean? get() = definedExternally; set(value) = definedExternally
    var uri: String? get() = definedExternally; set(value) = definedExternally
    var validation: dynamic /* String | Boolean */ get() = definedExternally; set(value) = definedExternally
}
external open class Storage(config: ConfigurationObject? = definedExternally /* null */) {
    open var acl: Acl = definedExternally
    open fun bucket(name: String): Bucket = definedExternally
    open fun bucket(name: Bucket): Bucket = definedExternally
    open fun channel(id: String, resourceId: String): Channel = definedExternally
    open fun createBucket(name: String, metadata: BucketConfig? = definedExternally /* null */): Promise<dynamic /* JsTuple<Bucket, ApiResponse> */> = definedExternally
    open fun getBuckets(query: BucketQuery? = definedExternally /* null */): Promise<dynamic /* JsTuple<Array<Bucket>> */> = definedExternally
    open fun getBucketsStream(query: BucketQuery? = definedExternally /* null */): Promise<dynamic /* JsTuple<Any> */> = definedExternally
    open var Channel: (storage: Storage, id: String, resourceId: String) -> Channel = definedExternally
    open var File: (bucket: Bucket, name: String, opts: BucketFileOptions) -> File = definedExternally
    open var Bucket: (storage: Storage, name: String) -> Bucket = definedExternally
}
external open class Channel(storage: Storage, id: String, resourceId: String) {
    open fun stop(): Promise<dynamic /* JsTuple<ApiResponse> */> = definedExternally
}
external interface ChannelConfig {
    var address: String
}
external interface `T$2` {
    @nativeGetter
    operator fun get(key: String): Boolean?
    @nativeSetter
    operator fun set(key: String, value: Boolean)
}
external open class Iam {
    open fun getPolicy(): Promise<IamPolicy> = definedExternally
    open fun setPolicy(policy: IamPolicy): Promise<dynamic /* JsTuple<IamPolicy, ApiResponse> */> = definedExternally
    open fun testPermissions(permission: String): Promise<dynamic /* JsTuple<`T$2`, ApiResponse> */> = definedExternally
    open fun testPermissions(permission: Array<String>): Promise<dynamic /* JsTuple<`T$2`, ApiResponse> */> = definedExternally
}
external interface IamPolicy {
    var bindings: Array<IamBinding>
}
external interface IamBinding {
    var role: String
    var members: Array<String>
}
