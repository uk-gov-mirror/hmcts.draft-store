package uk.gov.hmcts.reform.draftstore.endpoint.v3.helpers;

import uk.gov.hmcts.reform.draftstore.data.model.CreateDraft;
import uk.gov.hmcts.reform.draftstore.data.model.Draft;
import uk.gov.hmcts.reform.draftstore.data.model.UpdateDraft;

import java.time.ZonedDateTime;

public class SampleData {
    public static Draft draft(String id) {
        return new Draft(
            id,
            "abc",
            "serviceA",
            "{}",
            null,
            "some_type",
            ZonedDateTime.now(),
            ZonedDateTime.now()
        );
    }

    public static UpdateDraft updateDraft() {
        return new UpdateDraft("{}", null, "some_type");
    }

    public static CreateDraft createDraft(int maxStaleDays) {
        return new CreateDraft(
            "{}",
            null,
            "some_type",
            maxStaleDays
        );
    }
}
