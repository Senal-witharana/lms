package kln.iad.lms.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseHeader {
    private String responseCode;
    private String responseDesc;
}
