package org.evilkitten.slack.response.rtm.mesage.group;

import lombok.Data;
import org.evilkitten.slack.response.rtm.MessageEvent;

@Data
public class GroupPurposeEvent extends MessageEvent {
  private String purpose;
}
