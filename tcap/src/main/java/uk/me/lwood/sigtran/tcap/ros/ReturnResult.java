package uk.me.lwood.sigtran.tcap.ros;

import uk.me.lwood.asn1.annotations.Optional;
import uk.me.lwood.sigtran.tcap.TcapResult;

/**
 * 
 * @author lukew
 */
public class ReturnResult {
    private final InvokeId invokeId;
    @Optional
    private final TcapResult result;
    
    private ReturnResult(InvokeId invokeId, TcapResult result) {
        this.invokeId = invokeId;
        this.result = result;
    }

    public final InvokeId getInvokeId() {
        return invokeId;
    }

    public final TcapResult getResult() {
        return result;
    }
}
