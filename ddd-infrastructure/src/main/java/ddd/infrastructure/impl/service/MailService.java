package ddd.infrastructure.impl.service;

/**
 * @author xiudao
 * @date 2023/12/6
 */
public interface MailService {
    void sendMail(String id, String content);
}
