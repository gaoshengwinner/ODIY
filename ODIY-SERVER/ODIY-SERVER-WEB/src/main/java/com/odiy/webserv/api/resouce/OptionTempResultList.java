package com.odiy.webserv.api.resouce;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OptionTempResultList {

	List<OptionTempResult> optionTempLst;
}
