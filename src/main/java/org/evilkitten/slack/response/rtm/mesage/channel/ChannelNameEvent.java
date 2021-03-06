package org.evilkitten.slack.response.rtm.mesage.channel;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.evilkitten.slack.response.rtm.MessageEvent;

@Data
public class ChannelNameEvent extends MessageEvent {
  private String name;

  @JsonProperty("old_name")
  private String oldName;
}
