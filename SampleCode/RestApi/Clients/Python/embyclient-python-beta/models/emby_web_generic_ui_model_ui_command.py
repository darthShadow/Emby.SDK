# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

import pprint
import re  # noqa: F401

import six

class EmbyWebGenericUIModelUICommand(object):
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
        'command_type': 'EmbyWebGenericUIModelEnumsUICommandType',
        'command_id': 'str',
        'is_visible': 'bool',
        'is_enabled': 'bool',
        'caption': 'str',
        'set_focus': 'bool',
        'confirmation_message': 'str'
    }

    attribute_map = {
        'command_type': 'CommandType',
        'command_id': 'CommandId',
        'is_visible': 'IsVisible',
        'is_enabled': 'IsEnabled',
        'caption': 'Caption',
        'set_focus': 'SetFocus',
        'confirmation_message': 'ConfirmationMessage'
    }

    def __init__(self, command_type=None, command_id=None, is_visible=None, is_enabled=None, caption=None, set_focus=None, confirmation_message=None):  # noqa: E501
        """EmbyWebGenericUIModelUICommand - a model defined in Swagger"""  # noqa: E501
        self._command_type = None
        self._command_id = None
        self._is_visible = None
        self._is_enabled = None
        self._caption = None
        self._set_focus = None
        self._confirmation_message = None
        self.discriminator = None
        if command_type is not None:
            self.command_type = command_type
        if command_id is not None:
            self.command_id = command_id
        if is_visible is not None:
            self.is_visible = is_visible
        if is_enabled is not None:
            self.is_enabled = is_enabled
        if caption is not None:
            self.caption = caption
        if set_focus is not None:
            self.set_focus = set_focus
        if confirmation_message is not None:
            self.confirmation_message = confirmation_message

    @property
    def command_type(self):
        """Gets the command_type of this EmbyWebGenericUIModelUICommand.  # noqa: E501


        :return: The command_type of this EmbyWebGenericUIModelUICommand.  # noqa: E501
        :rtype: EmbyWebGenericUIModelEnumsUICommandType
        """
        return self._command_type

    @command_type.setter
    def command_type(self, command_type):
        """Sets the command_type of this EmbyWebGenericUIModelUICommand.


        :param command_type: The command_type of this EmbyWebGenericUIModelUICommand.  # noqa: E501
        :type: EmbyWebGenericUIModelEnumsUICommandType
        """

        self._command_type = command_type

    @property
    def command_id(self):
        """Gets the command_id of this EmbyWebGenericUIModelUICommand.  # noqa: E501


        :return: The command_id of this EmbyWebGenericUIModelUICommand.  # noqa: E501
        :rtype: str
        """
        return self._command_id

    @command_id.setter
    def command_id(self, command_id):
        """Sets the command_id of this EmbyWebGenericUIModelUICommand.


        :param command_id: The command_id of this EmbyWebGenericUIModelUICommand.  # noqa: E501
        :type: str
        """

        self._command_id = command_id

    @property
    def is_visible(self):
        """Gets the is_visible of this EmbyWebGenericUIModelUICommand.  # noqa: E501


        :return: The is_visible of this EmbyWebGenericUIModelUICommand.  # noqa: E501
        :rtype: bool
        """
        return self._is_visible

    @is_visible.setter
    def is_visible(self, is_visible):
        """Sets the is_visible of this EmbyWebGenericUIModelUICommand.


        :param is_visible: The is_visible of this EmbyWebGenericUIModelUICommand.  # noqa: E501
        :type: bool
        """

        self._is_visible = is_visible

    @property
    def is_enabled(self):
        """Gets the is_enabled of this EmbyWebGenericUIModelUICommand.  # noqa: E501


        :return: The is_enabled of this EmbyWebGenericUIModelUICommand.  # noqa: E501
        :rtype: bool
        """
        return self._is_enabled

    @is_enabled.setter
    def is_enabled(self, is_enabled):
        """Sets the is_enabled of this EmbyWebGenericUIModelUICommand.


        :param is_enabled: The is_enabled of this EmbyWebGenericUIModelUICommand.  # noqa: E501
        :type: bool
        """

        self._is_enabled = is_enabled

    @property
    def caption(self):
        """Gets the caption of this EmbyWebGenericUIModelUICommand.  # noqa: E501


        :return: The caption of this EmbyWebGenericUIModelUICommand.  # noqa: E501
        :rtype: str
        """
        return self._caption

    @caption.setter
    def caption(self, caption):
        """Sets the caption of this EmbyWebGenericUIModelUICommand.


        :param caption: The caption of this EmbyWebGenericUIModelUICommand.  # noqa: E501
        :type: str
        """

        self._caption = caption

    @property
    def set_focus(self):
        """Gets the set_focus of this EmbyWebGenericUIModelUICommand.  # noqa: E501


        :return: The set_focus of this EmbyWebGenericUIModelUICommand.  # noqa: E501
        :rtype: bool
        """
        return self._set_focus

    @set_focus.setter
    def set_focus(self, set_focus):
        """Sets the set_focus of this EmbyWebGenericUIModelUICommand.


        :param set_focus: The set_focus of this EmbyWebGenericUIModelUICommand.  # noqa: E501
        :type: bool
        """

        self._set_focus = set_focus

    @property
    def confirmation_message(self):
        """Gets the confirmation_message of this EmbyWebGenericUIModelUICommand.  # noqa: E501


        :return: The confirmation_message of this EmbyWebGenericUIModelUICommand.  # noqa: E501
        :rtype: str
        """
        return self._confirmation_message

    @confirmation_message.setter
    def confirmation_message(self, confirmation_message):
        """Sets the confirmation_message of this EmbyWebGenericUIModelUICommand.


        :param confirmation_message: The confirmation_message of this EmbyWebGenericUIModelUICommand.  # noqa: E501
        :type: str
        """

        self._confirmation_message = confirmation_message

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
        if issubclass(EmbyWebGenericUIModelUICommand, dict):
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
        if not isinstance(other, EmbyWebGenericUIModelUICommand):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other