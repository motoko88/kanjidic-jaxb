package llc.mirai.mapping;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Value;

import java.io.Serializable;

@Value
@AllArgsConstructor
@XmlRootElement(name = "radical")
@XmlAccessorType(XmlAccessType.FIELD)
public class Radical implements Serializable {
}
