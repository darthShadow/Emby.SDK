/*
 * EmbyClient.Dotnet.Beta
 * API Version: 4.8.0.5
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using SwaggerDateConverter = EmbyClient.Dotnet.Beta.Client.SwaggerDateConverter;

namespace EmbyClient.Dotnet.Beta.Model
{
    /// <summary>
    /// LiveTVApiSetChannelMapping
    /// </summary>
    [DataContract]
        public partial class LiveTVApiSetChannelMapping :  IEquatable<LiveTVApiSetChannelMapping>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LiveTVApiSetChannelMapping" /> class.
        /// </summary>
        /// <param name="tunerChannelId">tunerChannelId.</param>
        /// <param name="providerChannelId">providerChannelId.</param>
        public LiveTVApiSetChannelMapping(string tunerChannelId = default(string), string providerChannelId = default(string))
        {
            this.TunerChannelId = tunerChannelId;
            this.ProviderChannelId = providerChannelId;
        }
        
        /// <summary>
        /// Gets or Sets TunerChannelId
        /// </summary>
        [DataMember(Name="TunerChannelId", EmitDefaultValue=false)]
        public string TunerChannelId { get; set; }

        /// <summary>
        /// Gets or Sets ProviderChannelId
        /// </summary>
        [DataMember(Name="ProviderChannelId", EmitDefaultValue=false)]
        public string ProviderChannelId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LiveTVApiSetChannelMapping {\n");
            sb.Append("  TunerChannelId: ").Append(TunerChannelId).Append("\n");
            sb.Append("  ProviderChannelId: ").Append(ProviderChannelId).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as LiveTVApiSetChannelMapping);
        }

        /// <summary>
        /// Returns true if LiveTVApiSetChannelMapping instances are equal
        /// </summary>
        /// <param name="input">Instance of LiveTVApiSetChannelMapping to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LiveTVApiSetChannelMapping input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.TunerChannelId == input.TunerChannelId ||
                    (this.TunerChannelId != null &&
                    this.TunerChannelId.Equals(input.TunerChannelId))
                ) && 
                (
                    this.ProviderChannelId == input.ProviderChannelId ||
                    (this.ProviderChannelId != null &&
                    this.ProviderChannelId.Equals(input.ProviderChannelId))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.TunerChannelId != null)
                    hashCode = hashCode * 59 + this.TunerChannelId.GetHashCode();
                if (this.ProviderChannelId != null)
                    hashCode = hashCode * 59 + this.ProviderChannelId.GetHashCode();
                return hashCode;
            }
        }

    }
}