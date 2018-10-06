package the.flash.protocol.response;

import lombok.Data;
import the.flash.protocol.Packet;
import the.flash.session.Session;

import static the.flash.protocol.command.Command.GROUP_MESSAGE_RESPONSE;

@Data
public class GroupMessageResponsePacket extends Packet {

    private String fromGroupId;

    private Session fromUser;

    private String message;

    @Override
    public Byte getCommand() {

        return GROUP_MESSAGE_RESPONSE;
    }
}
