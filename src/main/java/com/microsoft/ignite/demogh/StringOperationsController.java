package com.microsoft.ignite.demogh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringOperationsController {
    private static final Logger logger = LoggerFactory.getLogger(StringOperationsController.class);

    @GetMapping("/concat")
    public ResponseEntity<String> concat(@RequestParam String str1, @RequestParam String str2) {
        logger.info("Received request to concatenate strings: str1={}, str2={}", str1, str2);

        if (str1 == null || str1.isEmpty() || str2 == null || str2.isEmpty()) {
            logger.error("Invalid parameters");
            return ResponseEntity.badRequest().body("Invalid parameters");
        }

        String result = str1.concat(str2);
        logger.info("Concatenation result: {}", result);

        return ResponseEntity.ok(result);
    }

    @GetMapping("/substring")
    public ResponseEntity<String> substring(@RequestParam String str, @RequestParam int beginIndex,
            @RequestParam int endIndex) {
        logger.info("Received request to get substring: str={}, beginIndex={}, endIndex={}", str, beginIndex, endIndex);

        if (str == null || str.isEmpty() || beginIndex < 0 || endIndex > str.length()) {
            logger.error("Invalid parameters");
            return ResponseEntity.badRequest().body("Invalid parameters");
        }

        String result = str.substring(beginIndex, endIndex);
        logger.info("Substring result: {}", result);

        return ResponseEntity.ok(result);
    }

    @GetMapping("/contains")
    public ResponseEntity<Boolean> contains(@RequestParam String str, @RequestParam String searchStr) {
        logger.info("Received request to check if string contains substring: str={}, searchStr={}", str, searchStr);

        if (str == null || str.isEmpty() || searchStr == null || searchStr.isEmpty()) {
            logger.error("Invalid parameters");
            return ResponseEntity.badRequest().body(false);
        }

        boolean result = str.contains(searchStr);
        logger.info("Contains result: {}", result);

        return ResponseEntity.ok(result);
    }

    // replace operation
    @GetMapping("/replace")
    public ResponseEntity<String> replace(@RequestParam String str, @RequestParam String oldStr,
            @RequestParam String newStr) {
        logger.info("Received request to replace substring: str={}, oldStr={}, newStr={}", str, oldStr, newStr);

        if (str == null || str.isEmpty() || oldStr == null || oldStr.isEmpty() || newStr == null || newStr.isEmpty()) {
            logger.error("Invalid parameters");
            return ResponseEntity.badRequest().body("Invalid parameters");
        }

        String result = str.replace(oldStr, newStr);
        logger.info("Replace result: {}", result);

        return ResponseEntity.ok(result);
    }
}