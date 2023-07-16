package llc.mirai.mapping;

import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * Header
 */
@Value
@AllArgsConstructor
@XmlRootElement(name = "header")
@XmlAccessorType(XmlAccessType.FIELD)
public class Header implements Serializable {

    @XmlElement(name="file_version")
    String fileVersion;

    @XmlElement(name="database_version")
    String databaseVersion;

    @XmlElement(name="date_of_creation")
    String dateOfCreation;

    public Header() {
        this(null, null, null);
    }
}
