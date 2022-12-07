package exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ErreurCode extends RuntimeException{

    @Getter
    private CodeErreur code;


}
