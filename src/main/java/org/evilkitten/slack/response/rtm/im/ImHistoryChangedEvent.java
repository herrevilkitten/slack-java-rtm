package org.evilkitten.slack.response.rtm.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.evilkitten.slack.response.rtm.RtmEvent;

@Data
public class ImHistoryChangedEvent extends RtmEvent {
  private double latest;

  @JsonProperty("ts")
  private double timeStamp;

  @JsonProperty("event_ts")
  private double eventTimeStamp;
}
