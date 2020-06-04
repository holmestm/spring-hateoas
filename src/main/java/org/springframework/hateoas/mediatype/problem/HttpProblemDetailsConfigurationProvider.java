package org.springframework.hateoas.mediatype.problem;

import java.util.Collection;

import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.config.HypermediaMappingInformation;
import org.springframework.hateoas.config.MediaTypeConfigurationProvider;
import org.springframework.hateoas.mediatype.ProvidedMediatype;
import org.springframework.http.MediaType;

/**
 * {@link MediaTypeConfigurationProvider} for HAL.
 *
 * @author Oliver Drotbohm
 */
class HttpProblemDetailsConfigurationProvider implements MediaTypeConfigurationProvider, ProvidedMediatype {

	/*
	 * (non-Javadoc)
	 * @see org.springframework.hateoas.config.HyperMediaTypeProvider#getConfiguration()
	 */
	@Override
	public Class<? extends HypermediaMappingInformation> getConfiguration() {
		return HttpProblemDetailsMappingInformation.class;
	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.hateoas.config.HyperMediaTypeProvider#supportsAny(java.util.Collection)
	 */
	@Override
	public boolean supportsAny(Collection<MediaType> providedMediaTypes) {
		return providedMediaTypes.contains(MediaTypes.HTTP_PROBLEM_DETAILS_JSON);
	}
}
