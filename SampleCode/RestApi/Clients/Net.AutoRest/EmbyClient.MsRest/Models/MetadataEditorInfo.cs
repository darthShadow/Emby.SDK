// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace EmbyClient.MsRest.Models
{
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    public partial class MetadataEditorInfo
    {
        /// <summary>
        /// Initializes a new instance of the MetadataEditorInfo class.
        /// </summary>
        public MetadataEditorInfo()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the MetadataEditorInfo class.
        /// </summary>
        public MetadataEditorInfo(IList<ParentalRating> parentalRatingOptions = default(IList<ParentalRating>), IList<GlobalizationCountryInfo> countries = default(IList<GlobalizationCountryInfo>), IList<GlobalizationCultureDto> cultures = default(IList<GlobalizationCultureDto>), IList<ExternalIdInfo> externalIdInfos = default(IList<ExternalIdInfo>))
        {
            ParentalRatingOptions = parentalRatingOptions;
            Countries = countries;
            Cultures = cultures;
            ExternalIdInfos = externalIdInfos;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "ParentalRatingOptions")]
        public IList<ParentalRating> ParentalRatingOptions { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Countries")]
        public IList<GlobalizationCountryInfo> Countries { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Cultures")]
        public IList<GlobalizationCultureDto> Cultures { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "ExternalIdInfos")]
        public IList<ExternalIdInfo> ExternalIdInfos { get; set; }

    }
}