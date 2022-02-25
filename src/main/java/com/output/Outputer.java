package com.output;

import com.definition.TableDefinition;
import java.io.OutputStream;

/**
 * @author xinqian.zhu
 * @date 2022/2/23
 */
public interface Outputer {

    void output(Iterable<TableDefinition> tableDefinitions, OutputStream outputStream) throws Exception;

}
