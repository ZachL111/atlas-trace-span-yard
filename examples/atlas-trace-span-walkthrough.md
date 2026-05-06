# Atlas Trace Span Yard Walkthrough

The fixture is intentionally compact, so the review starts with the cases that pull farthest apart.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | span volume | 107 | watch |
| stress | latency skew | 184 | ship |
| edge | signal loss | 186 | ship |
| recovery | incident shape | 215 | ship |
| stale | span volume | 156 | ship |

Start with `recovery` and `baseline`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The next useful expansion would be a malformed fixture around latency skew and incident shape.
