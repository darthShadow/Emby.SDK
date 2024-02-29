# coding: utf-8

"""
    Emby Server REST API
"""

import pprint
import re  # noqa: F401

import six

class PinRedeemResult(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'success': 'bool',
        'users_reset': 'list[str]'
    }

    attribute_map = {
        'success': 'Success',
        'users_reset': 'UsersReset'
    }

    def __init__(self, success=None, users_reset=None):  # noqa: E501
        """PinRedeemResult - a model defined in Swagger"""  # noqa: E501
        self._success = None
        self._users_reset = None
        self.discriminator = None
        if success is not None:
            self.success = success
        if users_reset is not None:
            self.users_reset = users_reset

    @property
    def success(self):
        """Gets the success of this PinRedeemResult.  # noqa: E501

        A value indicating whether this `MediaBrowser.Model.Users.PinRedeemResult` is success.  # noqa: E501

        :return: The success of this PinRedeemResult.  # noqa: E501
        :rtype: bool
        """
        return self._success

    @success.setter
    def success(self, success):
        """Sets the success of this PinRedeemResult.

        A value indicating whether this `MediaBrowser.Model.Users.PinRedeemResult` is success.  # noqa: E501

        :param success: The success of this PinRedeemResult.  # noqa: E501
        :type: bool
        """

        self._success = success

    @property
    def users_reset(self):
        """Gets the users_reset of this PinRedeemResult.  # noqa: E501

        The users reset.  # noqa: E501

        :return: The users_reset of this PinRedeemResult.  # noqa: E501
        :rtype: list[str]
        """
        return self._users_reset

    @users_reset.setter
    def users_reset(self, users_reset):
        """Sets the users_reset of this PinRedeemResult.

        The users reset.  # noqa: E501

        :param users_reset: The users_reset of this PinRedeemResult.  # noqa: E501
        :type: list[str]
        """

        self._users_reset = users_reset

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(PinRedeemResult, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, PinRedeemResult):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other