package com.michael.document.utils;

import com.michael.document.domain.Document;
import com.michael.document.domain.User;
import com.michael.document.entity.DocumentEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
@Slf4j
public class DocumentUtil {

    public static Document fromDocumentEntity(DocumentEntity documentEntity, User createdBy, User updatedBy) {
        log.info("create document in from");
        var document = new Document();
        log.info("create document in from");
        BeanUtils.copyProperties(documentEntity, document);
        log.info("copy document  with BEANS UTILS");
        document.setOwnerName(createdBy.getFirstName() + " " + createdBy.getLastName());
        document.setOwnerEmail(createdBy.getEmail());
        document.setOwnerPhone(createdBy.getPhone());
        document.setOwnerLastLogin(createdBy.getLastLogin());
        document.setUpdaterName(updatedBy.getFirstName() + " " + updatedBy.getLastName());
        return document;
    }


    public static String getDocumentUri(String filename) {
        return ServletUriComponentsBuilder.fromCurrentContextPath().path(String.format("/document/%s", filename)).toUriString();
    }

    public static String setIcon(String fileExtension) {
        String extension = StringUtils.trimAllWhitespace(fileExtension);
        if (extension.equalsIgnoreCase("DOC") || extension.equalsIgnoreCase("DOCX")) {
       //     return "https://htmlstream.com/preview/front-dashboard-v2.2.1/assets/svg/brands/word-icon.svg";
            return "";
        }
        if (extension.equalsIgnoreCase("XLS") || extension.equalsIgnoreCase("XLSX")) {
         //   return "https://htmlstream.com/preview/front-dashboard-v2.2.1/assets/svg/brands/excel-icon.svg";
            return "";
        }
        if (extension.equalsIgnoreCase("PDF")) {
         //   return "https://htmlstream.com/preview/front-dashboard-v2.2.1/assets/svg/brands/pdf-icon.svg";
            return "";
        } else {
          //  return "https://htmlstream.com/preview/front-dashboard-v2.2.1/assets/svg/brands/word-icon.svg";
            return "";
        }

    }
    //document service part 3

}