package org.evilkitten.slack.response.rtm.mesage.group;

import lombok.Data;
import org.evilkitten.slack.response.rtm.MessageEvent;

@Data
public class GroupTopicEvent extends MessageEvent {
  private String topic;
}