package org.evilkitten.slack.response.rtm.mesage.file;

import lombok.Data;
import org.evilkitten.slack.entity.File;
import org.evilkitten.slack.response.rtm.MessageEvent;

@Data
public class FileCommentEvent extends MessageEvent {
  private File file;
  private String comment;
}
