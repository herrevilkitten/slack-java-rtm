package org.evilkitten.slack.response.rtm.file;

import lombok.Data;
import org.evilkitten.slack.entity.File;
import org.evilkitten.slack.response.rtm.RtmEvent;

@Data
public class FileCreatedEvent extends RtmEvent {
  private File file;
}
