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
    /// Defines Attributes.SimpleCondition
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum AttributesSimpleCondition
    {
        /// <summary>
        /// Enum IsTrue for value: IsTrue
        /// </summary>
        [EnumMember(Value = "IsTrue")]
        IsTrue = 1,
        /// <summary>
        /// Enum IsFalse for value: IsFalse
        /// </summary>
        [EnumMember(Value = "IsFalse")]
        IsFalse = 2,
        /// <summary>
        /// Enum IsNull for value: IsNull
        /// </summary>
        [EnumMember(Value = "IsNull")]
        IsNull = 3,
        /// <summary>
        /// Enum IsNotNullOrEmpty for value: IsNotNullOrEmpty
        /// </summary>
        [EnumMember(Value = "IsNotNullOrEmpty")]
        IsNotNullOrEmpty = 4    }
}