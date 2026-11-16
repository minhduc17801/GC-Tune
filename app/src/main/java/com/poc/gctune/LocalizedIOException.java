package com.poc.gctune;

import java.io.IOException;

/** IOException whose user-facing text is a string resource, for code without a Context. */
final class LocalizedIOException extends IOException {
    final int resId;

    LocalizedIOException(int resId) {
        super("res:" + resId);
        this.resId = resId;
    }
}
