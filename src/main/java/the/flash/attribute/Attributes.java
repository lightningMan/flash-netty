package the.flash.attribute;

import io.netty.util.AttributeKey;
import the.flash.session.Session;

public interface Attributes {
    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}
