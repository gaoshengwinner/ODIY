package com.odiy.webserv.api.resouce;

import java.io.Serializable;

import com.odiy.domain.mapper.j99.model.ManaColor;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ManaColorResult implements Serializable {

	private int tempId;

	private int id;

	private String name;

	private boolean beUse;

	private MBColor mbColor;
	

	private static final long serialVersionUID = -3297027728822675484L;

	@Data
	@Builder
	public static class MBColor implements Serializable {

		private double red;

		private double green;

		private double blue;

		private double opacity;

		private static final long serialVersionUID = 6003135495812372358L;
	}

	private final static Byte isB = 1, isN = 0;

	public static ManaColor manaColorResult2ManaColor(ManaColorResult result) {
		if (result == null)
			return null;

		return ManaColor.builder().tempId(result.getTempId()).id(result.getId()).name(result.getName())
				.isUse(result.isBeUse() ? isB: isN).red(result.getMbColor().getRed())
				.green(result.getMbColor().getGreen()).blue(result.getMbColor().getBlue())
				.opacity(result.getMbColor().getOpacity()).build();

	}

	public static ManaColorResult manaColor2ManaColorResult(ManaColor manaColor) {
		if (manaColor == null)
			return null;
		return ManaColorResult.builder().tempId(manaColor.getTempId()).id(manaColor.getId()).name(manaColor.getName())
				.beUse(manaColor.getIsUse() == isB).mbColor(MBColor.builder().red(manaColor.getRed())
						.green(manaColor.getGreen()).blue(manaColor.getBlue()).opacity(manaColor.getOpacity()).build())
				.build();
	}

}
