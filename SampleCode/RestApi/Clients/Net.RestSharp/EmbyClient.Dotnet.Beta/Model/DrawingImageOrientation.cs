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
    /// Defines Drawing.ImageOrientation
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum DrawingImageOrientation
    {
        /// <summary>
        /// Enum TopLeft for value: TopLeft
        /// </summary>
        [EnumMember(Value = "TopLeft")]
        TopLeft = 1,
        /// <summary>
        /// Enum TopRight for value: TopRight
        /// </summary>
        [EnumMember(Value = "TopRight")]
        TopRight = 2,
        /// <summary>
        /// Enum BottomRight for value: BottomRight
        /// </summary>
        [EnumMember(Value = "BottomRight")]
        BottomRight = 3,
        /// <summary>
        /// Enum BottomLeft for value: BottomLeft
        /// </summary>
        [EnumMember(Value = "BottomLeft")]
        BottomLeft = 4,
        /// <summary>
        /// Enum LeftTop for value: LeftTop
        /// </summary>
        [EnumMember(Value = "LeftTop")]
        LeftTop = 5,
        /// <summary>
        /// Enum RightTop for value: RightTop
        /// </summary>
        [EnumMember(Value = "RightTop")]
        RightTop = 6,
        /// <summary>
        /// Enum RightBottom for value: RightBottom
        /// </summary>
        [EnumMember(Value = "RightBottom")]
        RightBottom = 7,
        /// <summary>
        /// Enum LeftBottom for value: LeftBottom
        /// </summary>
        [EnumMember(Value = "LeftBottom")]
        LeftBottom = 8    }
}