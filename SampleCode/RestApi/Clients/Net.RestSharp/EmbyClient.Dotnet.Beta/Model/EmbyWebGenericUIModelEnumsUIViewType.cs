/*
 * EmbyClient.Dotnet.Beta
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
    /// Defines Emby.Web.GenericUI.Model.Enums.UIViewType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum EmbyWebGenericUIModelEnumsUIViewType
    {
        /// <summary>
        /// Enum RegularPage for value: RegularPage
        /// </summary>
        [EnumMember(Value = "RegularPage")]
        RegularPage = 1,
        /// <summary>
        /// Enum Dialog for value: Dialog
        /// </summary>
        [EnumMember(Value = "Dialog")]
        Dialog = 2,
        /// <summary>
        /// Enum Wizard for value: Wizard
        /// </summary>
        [EnumMember(Value = "Wizard")]
        Wizard = 3    }
}