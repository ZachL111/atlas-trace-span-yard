# Review Journal

The cases below are the review handles I would use before changing the implementation.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its observability focus without claiming live deployment or external usage.

## Cases

- `baseline`: `span volume`, score 107, lane `watch`
- `stress`: `latency skew`, score 184, lane `ship`
- `edge`: `signal loss`, score 186, lane `ship`
- `recovery`: `incident shape`, score 215, lane `ship`
- `stale`: `span volume`, score 156, lane `ship`

## Note

The useful failure mode here is a wrong decision on a named case, not a vague style disagreement.
