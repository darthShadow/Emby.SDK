// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace EmbyClient.MsRest.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class ParentalRating
    {
        /// <summary>
        /// Initializes a new instance of the ParentalRating class.
        /// </summary>
        public ParentalRating()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the ParentalRating class.
        /// </summary>
        public ParentalRating(string name = default(string), int? value = default(int?))
        {
            Name = name;
            Value = value;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Name")]
        public string Name { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Value")]
        public int? Value { get; set; }

    }
}